package com.pheotrix.modules.admin.controller;

import com.pheotrix.modules.admin.service.AppUserService;
import com.pheotrix.common.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台前端首页数据统计
 *
 * @author pheotrix
 * @date 2022/4/17 16:49
 */
@RestController
@RequestMapping("admin/statistics")
@Api(tags = "管理端——数据统计")
public class StatisticController {

    @Autowired
    private AppUserService userService;


    @GetMapping("/home")
    @ApiOperation("后台前端首页数据统计")
    public R index() {

        return R.ok().put("result", userService.indexDate());
    }
}
