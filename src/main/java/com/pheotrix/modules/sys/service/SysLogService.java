
package com.pheotrix.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.pheotrix.modules.sys.entity.SysLogEntity;
import com.pheotrix.common.utils.PageUtils;

import java.util.Map;


/**
 * 系统日志
 *
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
