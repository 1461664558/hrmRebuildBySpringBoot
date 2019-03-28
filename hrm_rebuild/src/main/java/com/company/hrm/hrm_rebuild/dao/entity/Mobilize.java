package com.company.hrm.hrm_rebuild.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_emp_mobilize")
@Entity
public class Mobilize implements Serializable {
    @Id
    @GeneratedValue
    private int eno;
    private Date emdate;
    @Column(length = 10, nullable = false)
    private int odno;
    @Column(length = 10, nullable = false)
    private int idno;

    @Override
    public String toString() {
        return "Mobilize{" +
                "eno=" + eno +
                ", emdate=" + emdate +
                ", odno=" + odno +
                ", idno=" + idno +
                '}';
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public Date getEmdate() {
        return emdate;
    }

    public void setEmdate(Date emdate) {
        this.emdate = emdate;
    }

    public int getOdno() {
        return odno;
    }

    public void setOdno(int odno) {
        this.odno = odno;
    }

    public int getIdno() {
        return idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }

    public Mobilize(Date emdate, int odno, int idno) {
        this.emdate = emdate;
        this.odno = odno;
        this.idno = idno;
    }

    public Mobilize() {
    }
}
