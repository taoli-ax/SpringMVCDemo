package com.coh.controller.fileUpload;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.UUID;

@RestController
@RequestMapping("upload")
public class CupController10 {
    @PostMapping
    public String Upload(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request){
        if(!multipartFile.isEmpty()){
            try{
                System.out.println("CupController10.Upload: 上传到指定目录下");
                String realPath=request.getServletContext().getRealPath("/");
                String path=realPath.substring(0,realPath.lastIndexOf("target"));
                File dir=new File(path,"src/main/webapp/upload");
                System.out.println(dir);
                if(!dir.exists()){
                    dir.mkdirs();
                }
                String filename=multipartFile.getOriginalFilename();
                String suffix=filename.substring(filename.lastIndexOf("."));
                //替换为唯一名称
                UUID uuid=UUID.randomUUID();
                filename=uuid+suffix;

                multipartFile.transferTo(new File(dir,filename));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return "OK";
    }


}
