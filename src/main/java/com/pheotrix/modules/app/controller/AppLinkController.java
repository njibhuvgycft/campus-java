package com.pheotrix.modules.app.controller;

import com.pheotrix.common.utils.R;
import com.pheotrix.modules.admin.service.LinkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @date 2022/9/4 10:15
 */
@Api(tags = "用户端——分类")
@RestController
@RequestMapping("app/link")
public class AppLinkController {

    @Autowired
    private LinkService linkService;


    @GetMapping("/list")
    @ApiOperation("轮播图列表")
    public R getList(){

        return R.ok().put("result",linkService.list());
    }
}
