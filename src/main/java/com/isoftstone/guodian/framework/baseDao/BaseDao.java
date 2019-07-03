package com.isoftstone.guodian.framework.baseDao;

import com.isoftstone.guodian.framework.baseEntity.BaseEntity;
import com.isoftstone.guodian.utils.PageUtils;

import java.util.List;

/**
 * Created by issuser on 2019/7/1.
 * 所有Dao层接口必须继承该BaseDao接口
 */
public interface BaseDao<T extends BaseEntity> extends BaseDaoSupport {
     public int saveEntity(T entity) throws Exception;
     public int updateEntity(T entity) throws Exception;
     public int deleteEntity(String id) throws Exception;
     public T selectById(String id) throws Exception;
     public List<T> selectALL(StringBuffer whereSql) throws Exception;
     public int selectTotal(T entity) throws Exception;
     public List<T> selectForPage(T entity) throws Exception;


}
