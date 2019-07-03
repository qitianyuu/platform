package com.isoftstone.guodian.demo.entity;

import com.isoftstone.guodian.framework.baseEntity.BaseEntity;

/**
 * Created by issuser on 2019/7/2.
 */
public class DeptEntity extends BaseEntity {
    private String dname;
    private String des;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
