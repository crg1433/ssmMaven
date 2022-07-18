package com.chen.controller;

import com.chen.po.Ssm;
import com.chen.service.SsmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SsmController {
    @Autowired
    private SsmService ssmService;
    @RequestMapping("/ssm/findAll")
    public String findAll(Model model){
        System.out.println("Controller表现层：查询所有用户");
        List<Ssm> ssmList = ssmService.findAll();
        for (Ssm s:ssmList
             ) {
            System.out.println(s);
        }
        model.addAttribute("ssmList",ssmList);
        return "list";
    }

}
