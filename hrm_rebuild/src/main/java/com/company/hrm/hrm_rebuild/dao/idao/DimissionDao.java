package com.company.hrm.hrm_rebuild.dao.idao;

import com.company.hrm.hrm_rebuild.dao.entity.Dimission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DimissionDao extends JpaRepository<Dimission, Integer> {
    Dimission findById(int eno);
}
