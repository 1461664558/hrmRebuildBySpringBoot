package com.company.hrm.hrm_rebuild.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_emp_probation")
@Entity
public class Probation implements Serializable {
    @Id
    @GeneratedValue
    private int eno;
    private Date epsartdate;
    private Date ependdate;
    @Column(length = 10, nullable = false)
    private String epstate;

    @Override
    public String toString() {
        return "Probation{" +
                "eno=" + eno +
                ", epsartdate=" + epsartdate +
                ", ependdate=" + ependdate +
                ", epstate='" + epstate + '\'' +
                '}';
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public Date getEpsartdate() {
        return epsartdate;
    }

    public void setEpsartdate(Date epsartdate) {
        this.epsartdate = epsartdate;
    }

    public Date getEpenddate() {
        return ependdate;
    }

    public void setEpenddate(Date ependdate) {
        this.ependdate = ependdate;
    }

    public String getEpstate() {
        return epstate;
    }

    public void setEpstate(String epstate) {
        this.epstate = epstate;
    }

    public Probation(Date epsartdate, Date ependdate, String epstate) {
        this.epsartdate = epsartdate;
        this.ependdate = ependdate;
        this.epstate = epstate;
    }

    public Probation() {
    }
}
