package com.company.hrm.hrm_rebuild.service.iservice;

import com.company.hrm.hrm_rebuild.dao.entity.Job;

import java.util.List;

public interface JobService {

    void save(Job job);
    void delete(int jno);
    void update(Job job);
    Job findByID(int jno);
    List<Job> findByNameLike(String name);
    List<Job> findAll();

}
