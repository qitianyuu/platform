package com.isoftstone.guodian.treaty.entity;

import java.sql.Date;

/**
 * @ClassName TreatyEntity
 * @Description TODO
 * @Author qi
 * @Date 2019/7/5 8:48
 * @ModifyDate 2019/7/5 8:48
 * @Version 1.0
 */
public class TreatyEntity {
    private String treatyid;//合同编号
    private Date signaturedate;//签署日期
    private String name1;//甲方名称
    private String name2;//乙方名称
    private int transType;//运输方式，1：火车2：汽车
    private int checkType;//验收方式1：到场验收2：其他方式
    private Date deliveryBegin;//交货开始时间
    private Date deliveryEnd;//交货结束
    private String remarks;//备注
    private int status;//状态，1：保存2：已提交

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTreatyid() {
        return treatyid;
    }

    public void setTreatyid(String trentyid) {
        this.treatyid = trentyid;
    }

    public Date getSignaturedate() {
        return signaturedate;
    }

    public void setSignaturedate(Date signaturedate) {
        this.signaturedate = signaturedate;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getTransType() {
        return transType;
    }

    public void setTransType(int transType) {
        this.transType = transType;
    }

    public int getCheckType() {
        return checkType;
    }

    public void setCheckType(int checkType) {
        this.checkType = checkType;
    }

    public Date getDeliveryBegin() {
        return deliveryBegin;
    }

    public void setDeliveryBegin(Date deliveryBegin) {
        this.deliveryBegin = deliveryBegin;
    }

    public Date getDeliveryEnd() {
        return deliveryEnd;
    }

    public void setDeliveryEnd(Date deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void show(){
        System.out.println("交易合同编号：" + this.treatyid);
        System.out.println("甲方：" + this.name1);
        System.out.println("乙方：" + this.name2);
        /*System.out.println("运输防式：" + this.transType);*/
        /*System.out.println("签收方式：" + this.checkType);*/
        System.out.println("备注：" + this.remarks);
        System.out.println("状态：" + this.status);
    }
}

