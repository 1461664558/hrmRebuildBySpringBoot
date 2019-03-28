package com.company.hrm.hrm_rebuild.service.impl;

import com.company.hrm.hrm_rebuild.dao.entity.Job;
import com.company.hrm.hrm_rebuild.dao.idao.JobDao;
import com.company.hrm.hrm_rebuild.service.iservice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jobService")
public class JobServiceImpl implements JobService {

    @Autowired
    JobDao jobDao;

    @Override
    public void save(Job job) {
        jobDao.save(job);
    }

    @Override
    public void delete(int jno) {
        jobDao.deleteById(jno);
    }

    @Override
    public void update(Job job) {
        jobDao.save(job);
    }

    @Override
    public Job findByID(int jno) {
        return jobDao.findById(jno);
    }

    @Override
    public List<Job> findByNameLike(String name) {
        return jobDao.findByJnameLike(name);
    }

    @Override
    public List<Job> findAll() {
        return jobDao.findAll();
    }
}
