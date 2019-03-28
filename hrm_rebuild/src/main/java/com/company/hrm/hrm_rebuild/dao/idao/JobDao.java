package com.company.hrm.hrm_rebuild.dao.idao;

import com.company.hrm.hrm_rebuild.dao.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobDao extends JpaRepository<Job, Integer> {
    Job findById(int jno);
    List<Job> findByJnameLike(String name);
}
