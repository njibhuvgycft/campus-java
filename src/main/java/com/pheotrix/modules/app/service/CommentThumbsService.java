package com.pheotrix.modules.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.modules.admin.entity.AppUserEntity;
import com.pheotrix.modules.app.param.AddThumbsForm;
import com.pheotrix.modules.app.entity.CommentThumbsEntity;

import java.util.Map;

/**
 * 
 *
 * @author
 * @email 3582996245@qq.com
 * @date 2022-01-25 19:00:24
 */
public interface CommentThumbsService extends IService<CommentThumbsEntity> {

    PageUtils queryPage(Map<String, Object> params);

    Boolean isThumbs(Integer uid, Long id);

    Integer getThumbsCount(Long id);

    void addThumbs(AddThumbsForm request, AppUserEntity user);

    void cancelThumbs(AddThumbsForm request, AppUserEntity user);
}

