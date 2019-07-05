package com.isoftstone.guodian.treaty.service;

import com.isoftstone.guodian.framework.baseDao.BaseDaoSupport;
import com.isoftstone.guodian.treaty.entity.TreatyEntity;

public interface TreatyService extends BaseDaoSupport {
    public int addTreaty(TreatyEntity treatyEntity);
}
