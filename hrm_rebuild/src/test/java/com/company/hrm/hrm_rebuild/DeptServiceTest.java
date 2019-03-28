package com.company.hrm.hrm_rebuild;

import com.company.hrm.hrm_rebuild.dao.entity.Dept;
import com.company.hrm.hrm_rebuild.service.iservice.DeptService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class DeptServiceTest extends HrmRebuildApplicationTests{

    @Autowired
    DeptService deptService;

    @Test
    public void testSave(){
        Dept dept = new Dept("AA","company",123,new Date(),123);
        deptService.save(dept);
    }

    @Test
    public void testDelete(){
        deptService.delete(6);
    }

    @Test
    public void testUpdate(){
        Dept dept = deptService.findByID(5);
        dept.setDname("SS");
        deptService.update(dept);
    }

    @Test
    public void testFindById(){
        Dept dept = deptService.findByID(5);
        System.err.println(dept);
    }

    @Test
    public void testFindByNameLike(){
        List<Dept> list = deptService.findByNameLike("%SS%");
        for (Dept d : list){
            System.err.println(d);
        }
    }

    @Test
    public void testFindAll(){
        List<Dept> list = deptService.findAll();
        for(Dept d : list){
            System.err.println(d);
        }
    }



}
