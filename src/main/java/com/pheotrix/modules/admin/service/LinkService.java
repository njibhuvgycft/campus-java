package com.pheotrix.modules.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.modules.admin.entity.LinkEntity;

import java.util.Map;

/**
 * 
 *
 * @author pheotrix
 * @email 3582996245@qq.com
 * @date 2022-01-26 14:05:38
 */
public interface LinkService extends IService<LinkEntity> {

    PageUtils queryPage(Map<String, Object> params);

}

