package com.coh.controller;

import com.coh.pojo.Cup;
import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class CupController2 {
    /**
     * 三种方式
     * 返回 modelAndView
     * 返回 String 类型的 View
     * 返回 String 重定向
     * @return
     */
        @RequestMapping("list")

        public ModelAndView list(){
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.setViewName("cupList");//cupList.jsp
            ArrayList<Cup> list=new ArrayList<>();
            Cup cup1=new Cup();
            Cup cup2=new Cup();

            cup1.setName("Big Cup");
            cup2.setName("small Cup");
            cup1.setBrand("Starbucks");
            cup2.setBrand("Starbucks");
            list.add(cup1);
            list.add(cup2);
            modelAndView.addObject(list); // req.setAttribute()
            System.out.println("/cupSave cupController.save");
            return modelAndView;
        }
        @RequestMapping("list2")
        public  String list2(Model model){
            ArrayList<Cup> list=new ArrayList<>();
            Cup cup3=new Cup();
            cup3.setBrand("Starbucks");
            cup3.setName("small Cup");
            list.add(cup3);
            model.addAttribute(list);
            return "cupList";
        }
        @RequestMapping("list4")
        public String list4(){
            return "redirect:list";
        }
}
