package com.coh.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class CupController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        System.out.println("controller ");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("cupList");
        return modelAndView;
    }
}
