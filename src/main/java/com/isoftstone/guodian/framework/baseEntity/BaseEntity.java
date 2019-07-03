package com.isoftstone.guodian.framework.baseEntity;

import com.isoftstone.guodian.utils.PageUtils;

import java.io.Serializable;

/**
 * 所有Entity类继承该BaseEntity
 */
public class BaseEntity implements Serializable{
          private PageUtils pageUtils;
          private StringBuffer whereSql;

    public PageUtils getPageUtils() {
        return pageUtils;
    }

    public void setPageUtils(PageUtils pageUtils) {
        this.pageUtils = pageUtils;
    }

    public StringBuffer getWhereSql() {
        return whereSql;
    }

    public void setWhereSql(StringBuffer whereSql) {
        this.whereSql = whereSql;
    }
}
