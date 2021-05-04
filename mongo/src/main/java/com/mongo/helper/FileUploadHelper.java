package com.mongo.helper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploadHelper {
    // For Static
    // public final String UPLOAD_FILE = "/home/lite/Spring-projects/mongo/src/main/resources/static/pdf";

    // For Dynamic upload path
    public FileUploadHelper() throws IOException {
    }
    public final String UPLOAD_FILE = new ClassPathResource("static/pdf").getFile().getAbsolutePath();

    public boolean uploadFile(MultipartFile multipartFile){
        boolean output = false;
//        System.out.println(File.separator);
        try {
            Files.copy(multipartFile.getInputStream(),
                    Paths.get(UPLOAD_FILE + File.separator + multipartFile.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);
            output = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return output;
    }
}
