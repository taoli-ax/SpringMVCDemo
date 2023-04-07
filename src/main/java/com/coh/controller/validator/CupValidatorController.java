package com.coh.controller.validator;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("cupValidator")
public class CupValidatorController {
    /**
     * &chatGpt 来自chatGpt搜索
     * @param cup2 实体类
     * @param result 错误消息
     * @return
     */
    @RequestMapping("validate")
    public String validate(@Valid Cup2 cup2, BindingResult result){
        System.out.println("result:"+result);
        System.out.println("CupValidatorController.validate:"+cup2);
        return "save";
    }

    @RequestMapping("validate2")
    public String validate2(@Validated Cup2 cup2, Errors errors, Model model){
        List<FieldError> fieldErrorList=errors.getFieldErrors();
        if(fieldErrorList!=null&&fieldErrorList.size()>0){
            for (FieldError f:fieldErrorList
            ) {
                System.out.println(f.getField()+":"+f.getDefaultMessage());
                model.addAttribute(f.getField()+"Message",f.getDefaultMessage());
            }
        }
        return "validate";
    }
}
