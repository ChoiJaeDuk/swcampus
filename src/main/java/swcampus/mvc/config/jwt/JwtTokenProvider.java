package swcampus.mvc.config.jwt;

import java.nio.file.spi.FileSystemProvider;
import java.util.Date;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import swcampus.mvc.config.auth.PrincipalDetailsService;
import swcampus.mvc.domain.User;

@Service
public class JwtTokenProvider {

    private final PrincipalDetailsService principalDetailsService;

    public JwtTokenProvider(PrincipalDetailsService principalDetailsService) {
        this.principalDetailsService = principalDetailsService;
    }

    // JWT 토큰 생성
    public String createToken(User user) {
        Claims claims = Jwts.claims().setSubject(user.getUserId()); // JWT payload에 저장되는 정보
        claims.put("userId", user.getUserId());
        claims.put("userNo", user.getUserNo());

        Date now = new Date();
        Date validity = new Date(now.getTime() + JwtProperties.EXPIRATION_TIME); // 토큰 유효시간 설정

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(validity)
                .signWith(SignatureAlgorithm.HS256, JwtProperties.SECRET)
                .compact();
    }

    // JWT 토큰에서 인증 정보 조회
    public Authentication getAuthentication(String token) {
    	System.out.println(getUsername(token));
        UserDetails userDetails = principalDetailsService.loadUserByUsername(getUsername(token));
        System.out.println("여기와?");
        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }

    // JWT 토큰에서 username 추출
    public String getUsername(String token) {
    	
    	System.out.println(Jwts.parser().setSigningKey(JwtProperties.SECRET).parseClaimsJws(token).getBody().getSubject());
        return Jwts.parser().setSigningKey(JwtProperties.SECRET).parseClaimsJws(token).getBody().getSubject();
    }

    // JWT 토큰 검증
    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(JwtProperties.SECRET).parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }
}