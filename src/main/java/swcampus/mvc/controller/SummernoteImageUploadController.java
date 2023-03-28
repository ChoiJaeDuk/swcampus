package swcampus.mvc.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@RestController
public class SummernoteImageUploadController {

    @PostMapping("/ajax/saveimage")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file ,HttpSession session) {
        // 파일 업로드 로직 처리
        String savePath = session.getServletContext().getRealPath("/save/summernoteImage");
        String filename = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        String filepath = savePath + filename;
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(filepath);
            Files.write(path, bytes);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>("Failed to upload the file.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        // 업로드된 파일의 경로를 반환
        return ResponseEntity.ok(session.getServletContext().getRealPath("/save/summernoteImage/") + filename);
    }
}