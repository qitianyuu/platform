package com.isoftstone.guodian.demo.service;

import com.isoftstone.guodian.demo.dao.EmpDao;
import com.isoftstone.guodian.demo.entity.EmpEntity;
import com.isoftstone.guodian.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by issuser on 2019/7/1.
 */
@Service("empService")  //service层类被实例化
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpDao empDao;
    public int saveEntity(EmpEntity entity) throws Exception {

        return empDao.saveEntity(entity);
    }

    public int updateEntity(EmpEntity entity) throws Exception {
        return empDao.updateEntity(entity);
    }

    public int deleteEntity(String id) throws Exception {
        return empDao.deleteEntity(id);
    }

    public EmpEntity selectById(String id) throws Exception {
        return empDao.selectById(id);
    }

    public List<EmpEntity> selectALL(StringBuffer whereSql) throws Exception {
        return empDao.selectALL(whereSql);
    }

    public int selectTotal(EmpEntity entity) throws Exception {
        return empDao.selectTotal(entity);
    }

    public List<EmpEntity> selectForPage(EmpEntity entity) throws Exception {
        return empDao.selectForPage(entity);
    }

    public List<Map<String, Object>> selectEmpDept(EmpEntity entity) {
        return empDao.selectEmpDept(entity);
    }
}
