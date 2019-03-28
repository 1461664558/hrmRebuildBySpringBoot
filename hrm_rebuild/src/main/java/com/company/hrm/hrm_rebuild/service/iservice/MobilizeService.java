package com.company.hrm.hrm_rebuild.service.iservice;

import com.company.hrm.hrm_rebuild.dao.entity.Mobilize;

import java.util.List;

public interface MobilizeService {

    void save(Mobilize mobilize);
    void delete(int eno);
    void update(Mobilize mobilize);
    Mobilize findByID(int eno);
    List<Mobilize> findAll();

}
