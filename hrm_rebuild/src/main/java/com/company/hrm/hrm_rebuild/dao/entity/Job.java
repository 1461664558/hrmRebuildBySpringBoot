package com.company.hrm.hrm_rebuild.dao.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_job")
@Entity
public class Job implements Serializable {
    @Id
    @GeneratedValue
    private int jno;
    @Column(length = 20, nullable = false)
    private String jname;
    @Column(length = 20, nullable = false)
    private String jtype;

    @Override
    public String toString() {
        return "Job{" +
                "jno=" + jno +
                ", jname='" + jname + '\'' +
                ", jtype='" + jtype + '\'' +
                '}';
    }

    public int getJno() {
        return jno;
    }

    public void setJno(int jno) {
        this.jno = jno;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getJtype() {
        return jtype;
    }

    public void setJtype(String jtype) {
        this.jtype = jtype;
    }

    public Job(String jname, String jtype) {
        this.jname = jname;
        this.jtype = jtype;
    }

    public Job() {
    }
}
