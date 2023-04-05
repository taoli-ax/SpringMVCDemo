package com.coh.controller.requestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("map")
public class CupController4 {
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public String save(){
        System.out.println("CupController4.save");
        return "view";
    }

    @RequestMapping(value = "hide",params = {"a=ellie","b=safe"})
    public String landing(String a,String b){
        System.out.println("welcome:"+a+"--"+b);
        return "hiking";
    }
    @RequestMapping(value = "hide" ,headers = {"host=localhost:8080"})
    public String landing2(){
        return "hiking";
    }
    @RequestMapping("landing/{a}/{b}")
    public String landing3(@PathVariable("b") String b,@PathVariable("a") String a){
        System.out.println("a:"+a+" b:"+b);
        return "hiking";
    }
}
