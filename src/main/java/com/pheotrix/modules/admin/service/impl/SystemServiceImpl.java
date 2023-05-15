package com.pheotrix.modules.admin.service.impl;

import com.pheotrix.modules.admin.dao.SystemDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.common.utils.Query;

import com.pheotrix.modules.admin.entity.SystemEntity;
import com.pheotrix.modules.admin.service.SystemService;

@Service("systemService")
public class SystemServiceImpl extends ServiceImpl<SystemDao, SystemEntity> implements SystemService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SystemEntity> page = this.page(
                new Query<SystemEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }


}