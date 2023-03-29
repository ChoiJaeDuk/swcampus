package swcampus.mvc.controller;
import java.io.File;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.JsonObject;

@RestController
public class SummernoteImageUploadController {
	@PostMapping(value="/ajax/saveimage",produces = "application/json")
    @ResponseBody
    public JsonObject handleFileUpload(@RequestParam("file") MultipartFile file ,HttpServletRequest req, HttpServletResponse respon) throws Exception {
    	
        JsonObject json= new JsonObject();
    	
    	//저장될 경로 : webapp /save/
    	String root= req.getSession().getServletContext().getRealPath("/save/");
    	
    	UUID uuid=UUID.randomUUID();
    	String originalFileName=file.getOriginalFilename();
    	String extension=originalFileName.substring(originalFileName.lastIndexOf("."));//확장자
    	String savedFileName=uuid.toString().substring(0,10)+extension;
    	
    	System.out.println(extension);
    	System.out.println(savedFileName);
    	
    	File f = new File(root+savedFileName);
    	InputStream fileStream = file.getInputStream();
    	FileUtils.copyInputStreamToFile(fileStream, f);
    	
    	json.addProperty("url", "/save/"+savedFileName);
    	json.addProperty("reponse", "success");
    	
    	return json;
    	
    }
}