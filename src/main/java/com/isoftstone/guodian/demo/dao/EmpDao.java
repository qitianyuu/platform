package com.isoftstone.guodian.demo.dao;

import com.isoftstone.guodian.demo.entity.EmpEntity;
import com.isoftstone.guodian.framework.baseDao.BaseDao;
 import java.util.*;
/**
 * Created by issuser on 2019/7/1.
 */
public interface EmpDao extends BaseDao<EmpEntity>{
       public List<Map<String,Object>> selectEmpDept(EmpEntity entity);
}
