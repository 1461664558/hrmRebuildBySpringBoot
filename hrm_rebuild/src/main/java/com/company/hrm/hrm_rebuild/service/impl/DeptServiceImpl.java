package com.company.hrm.hrm_rebuild.service.impl;

import com.company.hrm.hrm_rebuild.dao.entity.Dept;
import com.company.hrm.hrm_rebuild.dao.idao.DeptDao;
import com.company.hrm.hrm_rebuild.service.iservice.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;


    @Override
    public void save(Dept dept) {
        deptDao.save(dept);
    }

    @Override
    public void delete(int dno) {
        deptDao.deleteById(dno);
    }

    @Override
    public void update(Dept dept) {
        deptDao.save(dept);
    }

    @Override
    public Dept findByID(int dno) {
        return deptDao.findById(dno);
    }

    @Override
    public List<Dept> findByNameLike(String name) {
        return deptDao.findByDnameLike(name);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
