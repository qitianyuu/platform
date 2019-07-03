package com.isoftstone.guodian.demo.entity;

import com.isoftstone.guodian.framework.baseEntity.BaseEntity;

import java.math.BigDecimal;
import java.sql.Date;
/**
 * Created by issuser on 2019/7/1.
 */
public class EmpEntity extends BaseEntity{
    private  Integer empno;
    private String ename;
    private String job;
    private BigDecimal sal;
    private String dname;
    private Date hiredate;
    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }


}
