package com.company.hrm.hrm_rebuild.service.iservice;

import com.company.hrm.hrm_rebuild.dao.entity.Dimission;

import java.util.List;

public interface DimissionService {

    void save(Dimission dimission);
    void delete(int eno);
    void update(Dimission dimission);
    Dimission findByID(int eno);
    List<Dimission> findAll();

}
