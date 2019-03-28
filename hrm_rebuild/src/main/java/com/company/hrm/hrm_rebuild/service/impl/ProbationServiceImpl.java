package com.company.hrm.hrm_rebuild.service.impl;

import com.company.hrm.hrm_rebuild.dao.entity.Probation;
import com.company.hrm.hrm_rebuild.dao.idao.ProbationDao;
import com.company.hrm.hrm_rebuild.service.iservice.ProbationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("probationService")
public class ProbationServiceImpl implements ProbationService {

    @Autowired
    ProbationDao probationDao;

    @Override
    public void save(Probation probation) {
        probationDao.save(probation);
    }

    @Override
    public void delete(int eno) {
        probationDao.deleteById(eno);
    }

    @Override
    public void update(Probation probation) {
        probationDao.save(probation);
    }

    @Override
    public Probation findByID(int eno) {
        return probationDao.findById(eno);
    }

    @Override
    public List<Probation> findAll() {
        return probationDao.findAll();
    }
}
