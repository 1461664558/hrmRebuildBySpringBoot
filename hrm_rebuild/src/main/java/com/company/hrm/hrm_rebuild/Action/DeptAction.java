package com.company.hrm.hrm_rebuild.Action;

import com.company.hrm.hrm_rebuild.service.iservice.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptAction {

    @Autowired
    DeptService deptService;

    @GetMapping("findall.do")
    public String findAll(){
        return deptService.findAll().toString();
    }

}
