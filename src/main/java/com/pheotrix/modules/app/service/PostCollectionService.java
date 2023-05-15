package com.pheotrix.modules.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.modules.admin.entity.AppUserEntity;
import com.pheotrix.modules.app.entity.PostCollectionEntity;
import com.pheotrix.modules.app.param.AddCollectionForm;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author linfeng
 * @email 3582996245@qq.com
 * @date 2022-01-24 20:49:32
 */
public interface PostCollectionService extends IService<PostCollectionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    Integer collectCount(Integer postId);

    Boolean isCollection(Integer uid,Integer postId);

    void cancelCollection(AddCollectionForm request, AppUserEntity user);

    List<Integer> getPostListByUid(Integer uid);
}

