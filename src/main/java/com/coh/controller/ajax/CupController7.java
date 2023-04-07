package com.coh.controller.ajax;

import com.coh.pojo.Cup;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("ajax")
public class CupController7 {
    @RequestMapping("json")
    public @ResponseBody List<Cup> jsonAjax(HttpServletResponse response) {
        List<Cup> cupList = new ArrayList<>();
        Cup cup1 = new Cup();
        Cup cup2 = new Cup();
        cup1.setName("hello");
        cup1.setBrand("33");
        cup2.setName("hello2");
        cup2.setBrand("h44");
        cupList.add(cup1);
        cupList.add(cup2);

    return cupList;
    }
    @RequestMapping("json2")
    public @ResponseBody String JsonAjax2(@RequestBody Cup cup){
        System.out.println("CupController7.JsonAjax2:"+cup);;
        return "OK";
    }
}
