package com.isoftstone.guodian.utils;

/**
 * Created by issuser on 2019/6/27.
 * 封装分页参数
 */
public class PageUtils {
           private int  pageNow=1; //当前页页码
           private int total;    //总记录数
           private int pageSize=5; //每页行记录数
           private int offset=0;//每页显示的第一条数据，在数据库中下标
           private int totalPage;//总页数

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        //给pageNow赋值，此时计算offset
        offset=pageSize*(pageNow-1) ;
        System.out.println(offset);
        this.pageNow = pageNow;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
         if(total%this.pageSize!=0){
             this.totalPage=total/this.pageSize+1;
         }   else{
             this.totalPage=total/this.pageSize;
         }
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }



}
