package com.coh.controller.interceptors;

import com.coh.pojo.Cup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("interceptor")
public class CupController9 {
    @GetMapping
    public String interceptor(){
        System.out.println("CupController9.interceptor");
        return "OK";
    }

    @GetMapping("login")
    public String list(){
        System.out.println("CupController9.login");
        return "OK";
    }


}
