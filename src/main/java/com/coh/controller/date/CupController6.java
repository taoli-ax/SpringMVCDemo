package com.coh.controller.date;

import com.coh.pojo.Cup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("date")
public class CupController6 {
    /**
     * landing.jsp
     * request.getParameter replaced by args
     * @param
     * @return
     */
    @RequestMapping("convert")
    public String CheckDate(Date date){
        System.out.println("CupController6.CheckDate"+date);
        return "save";
    }


}
