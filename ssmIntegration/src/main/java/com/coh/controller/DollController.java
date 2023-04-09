package com.coh.controller;

import com.coh.pojo.Doll;
import com.coh.service.DollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("Doll")
public class DollController {
    @Autowired
    private DollService dollService;
    @PostMapping("login")
    public String login(Doll doll, Model model){
        List<Doll> dollList=dollService.login(doll);
        if(dollList.size()==1){
            System.out.println("login success:"+dollList.toString());
            model.addAttribute(dollList);
            return "index";
        }else {
            System.out.println(dollList);
            return "redirect:/login.jsp";
        }

    }
}
