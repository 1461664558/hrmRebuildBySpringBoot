package com.company.hrm.hrm_rebuild.service.impl;

import com.company.hrm.hrm_rebuild.dao.entity.Emp;
import com.company.hrm.hrm_rebuild.dao.idao.DeptDao;
import com.company.hrm.hrm_rebuild.dao.idao.EmpDao;
import com.company.hrm.hrm_rebuild.service.iservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empService")
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpDao empDao;

    @Override
    public void save(Emp emp) {
        empDao.save(emp);
    }

    @Override
    public void delete(int eno) {
        empDao.deleteById(eno);
    }

    @Override
    public void update(Emp emp) {
        empDao.save(emp);
    }

    @Override
    public Emp findByID(int eno) {
        return empDao.findById(eno);
    }

    @Override
    public List<Emp> findByNameLike(String name) {
        return empDao.findByEnameLike(name);
    }

    @Override
    public List<Emp> findAll() {
        return empDao.findAll();
    }
}
