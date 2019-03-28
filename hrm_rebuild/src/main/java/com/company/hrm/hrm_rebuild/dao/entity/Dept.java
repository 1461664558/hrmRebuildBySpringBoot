package com.company.hrm.hrm_rebuild.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_dept")
@Entity
public class Dept implements Serializable {
    @Id
    @GeneratedValue
    private int dno;
    @Column(length = 20, nullable = false)
    private String dname;
    @Column(length = 20, nullable = false)
    private String dtype;
    @Column(length = 10, nullable = false)
    private int dphone;
    private Date dfounddate;
    @Column(length = 10, nullable = false)
    private int superdno;

    @Override
    public String toString() {
        return "t_dept{" +
                "dno=" + dno +
                ", dname='" + dname + '\'' +
                ", dtype='" + dtype + '\'' +
                ", dphone=" + dphone +
                ", dfounddate=" + dfounddate +
                ", superdno=" + superdno +
                '}';
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public int getDphone() {
        return dphone;
    }

    public void setDphone(int dphone) {
        this.dphone = dphone;
    }

    public Date getDfounddate() {
        return dfounddate;
    }

    public void setDfounddate(Date dfounddate) {
        this.dfounddate = dfounddate;
    }

    public int getSuperdno() {
        return superdno;
    }

    public void setSuperdno(int superdno) {
        this.superdno = superdno;
    }

    public Dept(String dname, String dtype, int dphone, Date dfounddate, int superdno) {
        this.dname = dname;
        this.dtype = dtype;
        this.dphone = dphone;
        this.dfounddate = dfounddate;
        this.superdno = superdno;
    }


    public Dept() {
    }
}
