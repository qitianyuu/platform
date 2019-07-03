package com.isoftstone.guodian.demo.service;

import com.isoftstone.guodian.demo.entity.EmpEntity;
import com.isoftstone.guodian.framework.baseService.BaseService;
import com.isoftstone.guodian.utils.PageUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by issuser on 2019/7/1.
 */
public interface EmpService extends BaseService  {
    public int saveEntity(EmpEntity entity) throws Exception;
    public int updateEntity(EmpEntity entity) throws Exception;
    public int deleteEntity(String id) throws Exception ;
    public EmpEntity selectById(String id) throws Exception ;
    public List<EmpEntity> selectALL(StringBuffer whereSql) throws Exception ;
    public int selectTotal(EmpEntity entity) throws Exception;
    public List<EmpEntity> selectForPage(EmpEntity entity) throws Exception ;
    public List<Map<String,Object>> selectEmpDept(EmpEntity entity);
}
