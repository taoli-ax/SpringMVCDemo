package com.coh.controller.view;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class MyView implements View {
    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        for(Map.Entry<String,?> entry:map.entrySet()){
            System.out.println("MyView.render:"+entry.getKey()+":"+entry.getValue());
            httpServletRequest.setAttribute(entry.getKey(),entry.getValue());
        }
        httpServletRequest.getRequestDispatcher("view.jsp").forward(httpServletRequest,httpServletResponse);
//        httpServletResponse.sendRedirect("view.jsp");
    }
}
