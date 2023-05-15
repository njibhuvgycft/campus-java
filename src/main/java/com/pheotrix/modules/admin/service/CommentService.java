package com.pheotrix.modules.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pheotrix.common.utils.AppPageUtils;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.modules.admin.entity.CommentEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author pheotrix
 * @email 3582996245@qq.com
 * @date 2022-01-24 21:29:22
 */
public interface CommentService extends IService<CommentEntity> {

    PageUtils queryPage(Map<String, Object> params);

    Integer getCountByTopicId(Integer id);

    void deleteByAdmin(List<Long> longs);

    Integer getCountByPostId(Integer id);

    AppPageUtils queryCommentPage(Integer postId, Integer page);

    Integer getYesterdayCount();

    Integer getAllCount();
}

