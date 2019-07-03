package com.isoftstone.guodian.entity;

import com.isoftstone.guodian.framework.baseEntity.BaseEntity;

import java.util.Date;

public class FultbpurchasingcancelEntity extends BaseEntity {
    private String cancleapplyid;

    private String purchapplyid;

    private Date operdate;

    private Integer autoid;

    private String operuser;

    private String createuser;

    private Date createdate;

    private String createuserid;

    private String createuserdeptid;

    private String createuserdeptcode;

    private String cancelname;

    private Date canceldate;

    private Integer cancelstate;

    private String executeid;

    private String cancelreason;

    public String getCancleapplyid() {
        return cancleapplyid;
    }

    public void setCancleapplyid(String cancleapplyid) {
        this.cancleapplyid = cancleapplyid;
    }

    public String getPurchapplyid() {
        return purchapplyid;
    }

    public void setPurchapplyid(String purchapplyid) {
        this.purchapplyid = purchapplyid;
    }

    public Date getOperdate() {
        return operdate;
    }

    public void setOperdate(Date operdate) {
        this.operdate = operdate;
    }

    public Integer getAutoid() {
        return autoid;
    }

    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }

    public String getOperuser() {
        return operuser;
    }

    public void setOperuser(String operuser) {
        this.operuser = operuser;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }

    public String getCreateuserdeptid() {
        return createuserdeptid;
    }

    public void setCreateuserdeptid(String createuserdeptid) {
        this.createuserdeptid = createuserdeptid;
    }

    public String getCreateuserdeptcode() {
        return createuserdeptcode;
    }

    public void setCreateuserdeptcode(String createuserdeptcode) {
        this.createuserdeptcode = createuserdeptcode;
    }

    public String getCancelname() {
        return cancelname;
    }

    public void setCancelname(String cancelname) {
        this.cancelname = cancelname;
    }

    public Date getCanceldate() {
        return canceldate;
    }

    public void setCanceldate(Date canceldate) {
        this.canceldate = canceldate;
    }

    public Integer getCancelstate() {
        return cancelstate;
    }

    public void setCancelstate(Integer cancelstate) {
        this.cancelstate = cancelstate;
    }

    public String getExecuteid() {
        return executeid;
    }

    public void setExecuteid(String executeid) {
        this.executeid = executeid;
    }

    public String getCancelreason() {
        return cancelreason;
    }

    public void setCancelreason(String cancelreason) {
        this.cancelreason = cancelreason;
    }
}