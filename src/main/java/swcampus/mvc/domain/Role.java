package swcampus.mvc.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    ROLE_USER("USER"),
    ROLE_ADMIN("ADMIN");
    
    String role;
    
    Role(String role){
    	this.role = role;
    }
    
    public String value() {
    	return role;
    }
}