package com.company.hrm.hrm_rebuild.service.iservice;

import com.company.hrm.hrm_rebuild.dao.entity.Dept;

import java.util.List;

public interface DeptService {

    void save(Dept dept);
    void delete(int dno);
    void update(Dept dept);
    Dept findByID(int dno);
    List<Dept> findByNameLike(String name);
    List<Dept> findAll();

}
