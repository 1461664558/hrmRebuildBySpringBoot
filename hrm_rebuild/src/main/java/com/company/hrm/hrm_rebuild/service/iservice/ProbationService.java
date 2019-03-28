package com.company.hrm.hrm_rebuild.service.iservice;

import com.company.hrm.hrm_rebuild.dao.entity.Probation;

import java.util.List;

public interface ProbationService {

    void save(Probation probation);
    void delete(int eno);
    void update(Probation probation);
    Probation findByID(int eno);
    List<Probation> findAll();

}
