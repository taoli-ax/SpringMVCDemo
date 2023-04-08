package com.coh.controller.restful;

import com.coh.pojo.Cup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("cups")
public class resfulController {
    @GetMapping
    public  String list(){
        System.out.println("resfulController.list");
        return "OK";
    }

    @GetMapping(value = "{id}")
    public  String list2(@PathVariable("id") Integer cid){
        System.out.println("resfulController.list:"+cid);
        return "OK";
    }

    @PostMapping
    public  String inserts(Cup cup){
        System.out.println("resfulController.insert:"+cup);
        return "OK";
    }

    @PutMapping
    public  String update(@RequestBody Cup cup){
        System.out.println("resfulController.update:"+cup);
        return "OK";
    }


    @DeleteMapping(value = "{id}")
    public  String delete(@PathVariable("id")Integer cid){
        System.out.println("resfulController.delete:"+cid);
        return "OK";
    }
}
