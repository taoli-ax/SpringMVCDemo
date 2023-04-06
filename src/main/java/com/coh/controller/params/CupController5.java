package com.coh.controller.params;

import com.coh.pojo.Cup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("landing")
public class CupController5 {
    /**
     * landing.jsp
     * request.getParameter replaced by args
     * @param PassName
     * @return
     */
    @RequestMapping("onLoad")
    public String OnLoad(String PassName){
        System.out.println("CupController.save1:"+PassName);
        return "save";
    }

    /**
     *  landing.jsp
     *  auto-conversion the type of args
     * @param age integer
     * @return
     */
    @RequestMapping("onCheck")
    public String OnCheck(Integer age){
        System.out.println("CupController5.OnCheck:"+(2023-age));
        return "save";
    }

    /**
     * landing.jsp
     * auto-encapsulation POJO
     * @param cup Class Cup
     * @return
     */
    @RequestMapping("cup")
    public String wholeMan(Cup cup){

        System.out.println("CupController5.OnCheck:"+cup);


        return "save";
    }

    /**
     * landing.jsp
     * checkbox can be conversion to Integer[] directly
     * @RequestParams Convert to List<?>
     * @param ids  <input name="ids">
     * @return
     */
    @RequestMapping("checkbox")
    public String checkbox(@RequestParam List<Integer> ids){
        System.out.println(Arrays.toString(ids.toArray()));
        return null;
    }


}
