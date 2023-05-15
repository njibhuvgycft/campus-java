package com.pheotrix.modules.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.modules.admin.entity.SystemEntity;

import java.util.Map;

/**
 * 
 *
 * @author pheotrix
 * @email 3582996245@qq.com
 * @date 2022-01-19 16:29:48
 */
public interface SystemService extends IService<SystemEntity> {

    PageUtils queryPage(Map<String, Object> params);


}

