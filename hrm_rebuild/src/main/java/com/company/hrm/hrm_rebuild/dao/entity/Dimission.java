package com.company.hrm.hrm_rebuild.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_emp_dimission")
@Entity
public class Dimission implements Serializable {
    @Id
    @GeneratedValue
    private int eno;
    private Date eddate;
    @Column(length = 10, nullable = false)
    private String edtype;
    @Column(length = 10, nullable = false)
    private String edtalent;

    @Override
    public String toString() {
        return "Dimission{" +
                "eno=" + eno +
                ", eddate=" + eddate +
                ", edtype='" + edtype + '\'' +
                ", edtalent='" + edtalent + '\'' +
                '}';
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public Date getEddate() {
        return eddate;
    }

    public void setEddate(Date eddate) {
        this.eddate = eddate;
    }

    public String getEdtype() {
        return edtype;
    }

    public void setEdtype(String edtype) {
        this.edtype = edtype;
    }

    public String getEdtalent() {
        return edtalent;
    }

    public void setEdtalent(String edtalent) {
        this.edtalent = edtalent;
    }

    public Dimission(Date eddate, String edtype, String edtalent) {
        this.eddate = eddate;
        this.edtype = edtype;
        this.edtalent = edtalent;
    }

    public Dimission() {
    }
}
