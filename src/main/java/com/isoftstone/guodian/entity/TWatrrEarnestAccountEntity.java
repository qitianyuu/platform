package com.isoftstone.guodian.entity;

import com.isoftstone.guodian.framework.baseEntity.BaseEntity;

import java.util.Date;

public class TWatrrEarnestAccountEntity extends BaseEntity {
    private String tWatrrEarnestAccount;

    private String accountId;

    private String purchapplyid;

    private String tWatrrEarnestAccountCode;

    private String organCode;

    private String optMember;

    private Date optTime;

    private Date account;

    private String type;

    private String remark;

    private String optionRemark;

    public String gettWatrrEarnestAccount() {
        return tWatrrEarnestAccount;
    }

    public void settWatrrEarnestAccount(String tWatrrEarnestAccount) {
        this.tWatrrEarnestAccount = tWatrrEarnestAccount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPurchapplyid() {
        return purchapplyid;
    }

    public void setPurchapplyid(String purchapplyid) {
        this.purchapplyid = purchapplyid;
    }

    public String gettWatrrEarnestAccountCode() {
        return tWatrrEarnestAccountCode;
    }

    public void settWatrrEarnestAccountCode(String tWatrrEarnestAccountCode) {
        this.tWatrrEarnestAccountCode = tWatrrEarnestAccountCode;
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

    public Date getAccount() {
        return account;
    }

    public void setAccount(Date account) {
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

    public String getOptionRemark() {
        return optionRemark;
    }

    public void setOptionRemark(String optionRemark) {
        this.optionRemark = optionRemark;
    }
}