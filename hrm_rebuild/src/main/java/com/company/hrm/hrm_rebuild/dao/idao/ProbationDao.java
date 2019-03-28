package com.company.hrm.hrm_rebuild.dao.idao;

import com.company.hrm.hrm_rebuild.dao.entity.Probation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProbationDao extends JpaRepository<Probation, Integer> {
    Probation findById(int eno);
}
