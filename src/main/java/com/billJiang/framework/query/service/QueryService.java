package com.billJiang.framework.query.service;

import com.billJiang.framework.base.service.BaseService;
import com.billJiang.framework.query.entity.QueryConfig;

public interface QueryService extends BaseService {

    /**
     * 保存用户自定义设置
     * 
     * @param queryConfig
     */
    public void deleteAndSave(QueryConfig queryConfig);

    /**
     * 恢复默认
     * 
     * @param queryConfig
     */
    public void delete(QueryConfig queryConfig);

}
