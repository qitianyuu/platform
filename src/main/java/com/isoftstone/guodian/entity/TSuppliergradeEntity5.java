package com.isoftstone.guodian.entity;

import com.isoftstone.guodian.framework.baseEntity.BaseEntity;

public class TSuppliergradeEntity5 extends BaseEntity {
    private String supplierid;

    private String gradeid;

    private String gradeName;

    private Integer sort;

    private Integer remark;

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getGradeid() {
        return gradeid;
    }

    public void setGradeid(String gradeid) {
        this.gradeid = gradeid;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getRemark() {
        return remark;
    }

    public void setRemark(Integer remark) {
        this.remark = remark;
    }
}