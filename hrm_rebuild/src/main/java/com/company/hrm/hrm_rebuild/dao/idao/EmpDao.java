package com.company.hrm.hrm_rebuild.dao.idao;

import com.company.hrm.hrm_rebuild.dao.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpDao extends JpaRepository<Emp, Integer> {
    Emp findById(int eno);
    List<Emp> findByEnameLike(String name);
}
