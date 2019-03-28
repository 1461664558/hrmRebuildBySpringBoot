package com.company.hrm.hrm_rebuild.service.impl;

import com.company.hrm.hrm_rebuild.dao.entity.Dimission;
import com.company.hrm.hrm_rebuild.dao.idao.DimissionDao;
import com.company.hrm.hrm_rebuild.service.iservice.DimissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dimissionService")
public class DimissionServiceImpl implements DimissionService {

    @Autowired
    DimissionDao dimissionDao;

    @Override
    public void save(Dimission dimission) {
        dimissionDao.save(dimission);
    }

    @Override
    public void delete(int eno) {
        dimissionDao.deleteById(eno);
    }

    @Override
    public void update(Dimission dimission) {
        dimissionDao.save(dimission);
    }

    @Override
    public Dimission findByID(int eno) {
        return dimissionDao.findById(eno);
    }

    @Override
    public List<Dimission> findAll() {
        return dimissionDao.findAll();
    }
}
