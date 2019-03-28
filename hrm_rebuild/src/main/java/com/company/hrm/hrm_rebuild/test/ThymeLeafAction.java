package com.company.hrm.hrm_rebuild.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ThymeLeafAction {
    @RequestMapping("index.do")
    public String visitIndex(Map<String,Object> map){
        map.put("username","SCOTT");
        map.put("age",22);
        return "test";
    }
}
