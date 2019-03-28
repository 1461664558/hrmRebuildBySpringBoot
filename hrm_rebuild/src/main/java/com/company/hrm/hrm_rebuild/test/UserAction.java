package com.company.hrm.hrm_rebuild.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction {

    @Autowired
    User user;

    @Value("${desc}")
    private String desc;
    @Value("${server.port}")
    private String port;

    @RequestMapping("hello.do")
    public String hello(){
        return "<h1>hello!!!!!!!</h1>";
    }

    @RequestMapping("value.do")
    public String value(){
        return user.toString() + " ------------ " + desc + " + " + port;
    }
}
