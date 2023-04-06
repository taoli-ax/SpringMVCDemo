package com.coh.controller.params;

import com.coh.pojo.Cup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/auto-encapsulation")
public class CupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("run in");
        // 解释springmvc自动创建对象的原理
        Map<String,String[]> params=req.getParameterMap();
        try {
            Cup cup=(Cup)Tools.map2Object(params, Cup.class);
            System.out.println(cup);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
