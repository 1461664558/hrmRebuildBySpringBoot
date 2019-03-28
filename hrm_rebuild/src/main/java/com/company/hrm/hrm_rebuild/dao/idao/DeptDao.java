package com.company.hrm.hrm_rebuild.dao.idao;

import com.company.hrm.hrm_rebuild.dao.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeptDao extends JpaRepository<Dept, Integer> {
    Dept findById(int dno);
    List<Dept> findByDnameLike(String name);
}
