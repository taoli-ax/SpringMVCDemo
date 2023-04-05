package com.coh.controller;

import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CupController2 {
        @RequestMapping("cupSave")
        public ModelAndView save(){
        System.out.println("/cupSave cupController.save");
            return null;
        }
}
