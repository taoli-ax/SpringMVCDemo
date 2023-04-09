package com.coh.controller.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@RestController
@RequestMapping("exception")
public class CupController11 {
    @GetMapping(value = "{num}")
    public String Upload(@PathVariable("num")Integer num){
        System.out.println(num);
        int i=1/num;
        return "error";
    }


}
