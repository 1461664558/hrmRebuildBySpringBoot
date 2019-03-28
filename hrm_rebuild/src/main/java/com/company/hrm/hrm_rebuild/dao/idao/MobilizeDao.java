package com.company.hrm.hrm_rebuild.dao.idao;

import com.company.hrm.hrm_rebuild.dao.entity.Mobilize;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobilizeDao extends JpaRepository<Mobilize, Integer> {
    Mobilize findById(int eno);
}
