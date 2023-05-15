package com.pheotrix.modules.admin.controller;

import java.util.Arrays;
import java.util.Map;

import com.pheotrix.modules.admin.entity.CommentEntity;
import com.pheotrix.modules.admin.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.common.utils.R;



/**
 * 
 * 评论管理
 * @author pheotrix
 * @email 2445465217@qq.com
 * @date 2022-01-24 21:29:22
 */
@Api(tags = "管理端——评论管理")
@RestController
@RequestMapping("admin/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;



    @GetMapping("/list")
    @RequiresPermissions("admin:comment:list")
    @ApiOperation("评论列表")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = commentService.queryPage(params);

        return R.ok().put("page", page);
    }



    @GetMapping("/info/{id}")
    @RequiresPermissions("admin:comment:info")
    @ApiOperation("评论详情")
    public R info(@PathVariable("id") Long id){
		CommentEntity comment = commentService.getById(id);

        return R.ok().put("comment", comment);
    }



    @PostMapping("/update")
    @RequiresPermissions("admin:comment:update")
    @ApiOperation("评论修改")
    public R update(@RequestBody CommentEntity comment){
		commentService.updateById(comment);

        return R.ok();
    }


    @PostMapping("/delete")
    @RequiresPermissions("admin:comment:delete")
    @ApiOperation("评论删除")
    public R delete(@RequestBody Long[] ids){
        commentService.deleteByAdmin(Arrays.asList(ids));
        return R.ok();
    }

}
