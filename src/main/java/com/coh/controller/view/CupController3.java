package com.coh.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CupController3 {
    @RequestMapping("hiking")
    public String hiking(){
        System.out.println("cupController3.hiking => hiking.jsp");
        return "save";
    }
    @RequestMapping("save")
    public String save(Model model){
        model.addAttribute("send","received?");
        System.out.println("cupController3.save => save.jsp");
        return"myView";
    }
}
