package com.company.hrm.hrm_rebuild.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_emp")
@Entity
public class Emp implements Serializable {
    @Id
    @GeneratedValue
    private int eno;
    @Column(length = 20, nullable = false)
    private String ename;
    @Column(length = 10, nullable = false)
    private String esex;
    private Date ebirthday;
    @Column(length = 10, nullable = false)
    private int eid;
    @Column(length = 10, nullable = false)
    private String eedu;
    @Column(length = 10, nullable = false)
    private int dno;
    @Column(length = 10, nullable = false)
    private int jno;
    private Date hireday;
    private Date jobstartday;
    @Column(length = 10, nullable = false)
    private String estate;
    @Column(length = 10, nullable = false)
    private String etype;
    @Column(length = 10, nullable = false)
    private String efrom;

    @Override
    public String toString() {
        return "Emp{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", esex='" + esex + '\'' +
                ", ebirthday=" + ebirthday +
                ", eid=" + eid +
                ", eedu='" + eedu + '\'' +
                ", dno=" + dno +
                ", jno=" + jno +
                ", hireday=" + hireday +
                ", jobstartday=" + jobstartday +
                ", estate='" + estate + '\'' +
                ", etype='" + etype + '\'' +
                ", efrom='" + efrom + '\'' +
                '}';
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public Date getEbirthday() {
        return ebirthday;
    }

    public void setEbirthday(Date ebirthday) {
        this.ebirthday = ebirthday;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEedu() {
        return eedu;
    }

    public void setEedu(String eedu) {
        this.eedu = eedu;
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public int getJno() {
        return jno;
    }

    public void setJno(int jno) {
        this.jno = jno;
    }

    public Date getHireday() {
        return hireday;
    }

    public void setHireday(Date hireday) {
        this.hireday = hireday;
    }

    public Date getJobstartday() {
        return jobstartday;
    }

    public void setJobstartday(Date jobstartday) {
        this.jobstartday = jobstartday;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    public String getEtype() {
        return etype;
    }

    public void setEtype(String etype) {
        this.etype = etype;
    }

    public String getEfrom() {
        return efrom;
    }

    public void setEfrom(String efrom) {
        this.efrom = efrom;
    }

    public Emp(String ename, String esex, Date ebirthday, int eid, String eedu, int dno, int jno, Date hireday, Date jobstartday, String estate, String etype, String efrom) {
        this.ename = ename;
        this.esex = esex;
        this.ebirthday = ebirthday;
        this.eid = eid;
        this.eedu = eedu;
        this.dno = dno;
        this.jno = jno;
        this.hireday = hireday;
        this.jobstartday = jobstartday;
        this.estate = estate;
        this.etype = etype;
        this.efrom = efrom;
    }

    public Emp() {
    }
}
