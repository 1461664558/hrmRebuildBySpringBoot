package com.company.hrm.hrm_rebuild.service.impl;

import com.company.hrm.hrm_rebuild.dao.entity.Mobilize;
import com.company.hrm.hrm_rebuild.dao.idao.MobilizeDao;
import com.company.hrm.hrm_rebuild.service.iservice.MobilizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mobilizeService")
public class MobilizeServiceImpl implements MobilizeService {

    @Autowired
    MobilizeDao mobilizeDao;

    @Override
    public void save(Mobilize mobilize) {
        mobilizeDao.save(mobilize);
    }

    @Override
    public void delete(int eno) {
        mobilizeDao.deleteById(eno);
    }

    @Override
    public void update(Mobilize mobilize) {
        mobilizeDao.save(mobilize);
    }

    @Override
    public Mobilize findByID(int eno) {
        return mobilizeDao.findById(eno);
    }

    @Override
    public List<Mobilize> findAll() {
        return mobilizeDao.findAll();
    }
}
