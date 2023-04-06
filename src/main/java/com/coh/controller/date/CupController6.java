package com.coh.controller.date;

import com.coh.pojo.Cup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("date")
public class CupController6 {
    /**
     * date.jsp
     * request.getParameter replaced by args
     * @param
     * @return
     */
    @RequestMapping("convert")
    public String CheckDate(Date date){
        System.out.println("CupController6.CheckDate"+date);
        return "save";
    }

    @RequestMapping("servlet-api")
    public void login(String name,HttpServletRequest request, HttpServletResponse response, HttpSession httpSession){
        System.out.println("CupController6.login:"+name);
        System.out.println("CupController6.login:"+request);
        System.out.println("CupController6.login:"+response);
        System.out.println("CupController6.login:"+httpSession);
        System.out.println("CupController6.login:"+httpSession.getServletContext());

    }


}
