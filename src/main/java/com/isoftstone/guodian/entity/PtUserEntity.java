package com.isoftstone.guodian.entity;

import com.isoftstone.guodian.framework.baseEntity.BaseEntity;

import java.util.Date;

/**
 * @Author qi
 * @Version 1.0
 * 用户表
 */
public class PtUserEntity extends BaseEntity {
    private String userUuid;

    private String id;

    private String username;//用户名

    private String password;//密码

    private String email;//邮件

    private String mobile;//电话

    private Short enabled;//是否有效

    private Short accountNonExpired;//账号是否过期

    private Short credentialsNonExpired;//凭证是否过期

    private Short accountNonLocked;//账号是否锁定

    private String organUuid;//组织机构id

    private String niceName;//真实姓名

    private Short isAdmin;//是否管理员

    private Short maximumsessions;

    private Date registerdate;//注册日期

    private Date lastlogintime;//上次登录时间

    private String pwdque;//密保问题

    private String pwdans;//密保答案

    private String remark;//备注

    private String depid;//部门id

    private String status;//是否删除

    private Date modtime;//修改时间

    private String modifierid;//修改人id

    private Short isSum;//是否阳光用户

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Short getEnabled() {
        return enabled;
    }

    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    public Short getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(Short accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public Short getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(Short credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Short getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Short accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public String getOrganUuid() {
        return organUuid;
    }

    public void setOrganUuid(String organUuid) {
        this.organUuid = organUuid;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    public Short getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Short isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Short getMaximumsessions() {
        return maximumsessions;
    }

    public void setMaximumsessions(Short maximumsessions) {
        this.maximumsessions = maximumsessions;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getPwdque() {
        return pwdque;
    }

    public void setPwdque(String pwdque) {
        this.pwdque = pwdque;
    }

    public String getPwdans() {
        return pwdans;
    }

    public void setPwdans(String pwdans) {
        this.pwdans = pwdans;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getModtime() {
        return modtime;
    }

    public void setModtime(Date modtime) {
        this.modtime = modtime;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid;
    }

    public Short getIsSum() {
        return isSum;
    }

    public void setIsSum(Short isSum) {
        this.isSum = isSum;
    }
}