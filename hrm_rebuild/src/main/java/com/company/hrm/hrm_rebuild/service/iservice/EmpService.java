package com.company.hrm.hrm_rebuild.service.iservice;

import com.company.hrm.hrm_rebuild.dao.entity.Emp;

import java.util.List;

public interface EmpService {

    void save(Emp emp);
    void delete(int eno);
    void update(Emp emp);
    Emp findByID(int eno);
    List<Emp> findByNameLike(String name);
    List<Emp> findAll();

}
