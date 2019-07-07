package com.isoftstone.guodian.demo.service;

import com.isoftstone.guodian.demo.dao.TFultbpurchasingapplyDao;
import com.isoftstone.guodian.entity.TFultbpurchasingapplyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Classname TFultbPurchasingApplyServiceImpl
 * @Description TODO
 * @auther daijiankun laptop
 * @create 2019-07-07 7:06 PM
 */

@Service
public class TFultbPurchasingApplyServiceImpl implements TFultbPurchasingApplyService {

    @Autowired
    TFultbpurchasingapplyDao tFultbpurchasingapplyDao;

    public int saveEntity(TFultbpurchasingapplyEntity entity) throws Exception {
        return tFultbpurchasingapplyDao.saveEntity(entity);
    }

    public int updateEntity(TFultbpurchasingapplyEntity entity) throws Exception {
        return tFultbpurchasingapplyDao.updateEntity(entity);
    }

    public int deleteEntity(String id) throws Exception {
        return tFultbpurchasingapplyDao.deleteEntity(id);
    }

    public TFultbpurchasingapplyEntity selectById(String id) throws Exception {
        return null;
    }

    public List<TFultbpurchasingapplyEntity> selectALL(StringBuffer whereSql) throws Exception {
        return tFultbpurchasingapplyDao.selectALL(whereSql);
    }

    public int selectTotal(TFultbpurchasingapplyEntity entity) throws Exception {
        return tFultbpurchasingapplyDao.selectTotal(entity);
    }

    public List<TFultbpurchasingapplyEntity> selectForPage(TFultbpurchasingapplyEntity entity) throws Exception {
        return tFultbpurchasingapplyDao.selectForPage(entity);
    }
}
