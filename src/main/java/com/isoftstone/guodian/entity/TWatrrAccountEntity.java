package com.isoftstone.guodian.entity;

import com.isoftstone.guodian.framework.baseEntity.BaseEntity;

import java.util.Date;

public class TWatrrAccountEntity extends BaseEntity {
    private String wateraAccountId;

    private String accountId;

    private String wateraAccountCode;

    private String organCode;

    private String optMember;

    private Date optTime;

    private Integer account;

    private String type;

    private String remark;

    private String remittanceType;

    private Date remittanceTime;

    public String getWateraAccountId() {
        return wateraAccountId;
    }

    public void setWateraAccountId(String wateraAccountId) {
        this.wateraAccountId = wateraAccountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getWateraAccountCode() {
        return wateraAccountCode;
    }

    public void setWateraAccountCode(String wateraAccountCode) {
        this.wateraAccountCode = wateraAccountCode;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getOptMember() {
        return optMember;
    }

    public void setOptMember(String optMember) {
        this.optMember = optMember;
    }

    public Date getOptTime() {
        return optTime;
    }

    public void setOptTime(Date optTime) {
        this.optTime = optTime;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemittanceType() {
        return remittanceType;
    }

    public void setRemittanceType(String remittanceType) {
        this.remittanceType = remittanceType;
    }

    public Date getRemittanceTime() {
        return remittanceTime;
    }

    public void setRemittanceTime(Date remittanceTime) {
        this.remittanceTime = remittanceTime;
    }
}