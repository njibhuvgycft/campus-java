package com.pheotrix.modules.admin.service.impl;

import com.pheotrix.modules.admin.dao.LinkDao;
import com.pheotrix.modules.admin.entity.LinkEntity;
import com.pheotrix.modules.admin.service.LinkService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.common.utils.Query;


@Service("linkService")
public class LinkServiceImpl extends ServiceImpl<LinkDao, LinkEntity> implements LinkService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LinkEntity> page = this.page(
                new Query<LinkEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}