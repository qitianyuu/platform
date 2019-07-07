package com.isoftstone.guodian.demo.service;

import com.isoftstone.guodian.entity.TFultbpurchasingapplyEntity;
import com.isoftstone.guodian.framework.baseService.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TFultbPurchasingApplyService extends BaseService {
    int saveEntity(TFultbpurchasingapplyEntity entity) throws Exception;
    int updateEntity(TFultbpurchasingapplyEntity entity) throws Exception;
    int deleteEntity(String id) throws Exception ;
    TFultbpurchasingapplyEntity selectById(String id) throws Exception ;
    List<TFultbpurchasingapplyEntity> selectALL(StringBuffer whereSql) throws Exception ;
    int selectTotal(TFultbpurchasingapplyEntity entity) throws Exception;
    List<TFultbpurchasingapplyEntity> selectForPage(TFultbpurchasingapplyEntity entity) throws Exception ;
}
