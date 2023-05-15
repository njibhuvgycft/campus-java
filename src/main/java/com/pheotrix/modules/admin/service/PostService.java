package com.pheotrix.modules.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pheotrix.common.vo.PostDetailResponse;
import com.pheotrix.common.utils.AppPageUtils;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.modules.admin.entity.AppUserEntity;
import com.pheotrix.modules.admin.entity.PostEntity;
import com.pheotrix.modules.app.param.AddCollectionForm;
import com.pheotrix.modules.app.param.AddCommentForm;
import com.pheotrix.modules.app.param.AddPostForm;
import com.pheotrix.modules.app.param.PostListForm;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author pheotrix
 * @email 3582996245@qq.com
 * @date 2022-01-23 20:49:55
 */
public interface PostService extends IService<PostEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void deleteByAdmin(List<Integer> integers);

    Integer getPostNumByUid(Integer uid);

    AppPageUtils lastPost(Integer page);

    AppPageUtils followUserPost(Integer page, AppUserEntity user);

    void addCollection(AddCollectionForm request, AppUserEntity user);

    AppPageUtils myPost(Integer page, AppUserEntity user);

    AppPageUtils myCollectPost(Integer page,AppUserEntity user);

    PostDetailResponse detail(Integer id);

    void addComment(AddCommentForm request, AppUserEntity user);

    Integer addPost(AddPostForm request, AppUserEntity user);

    AppPageUtils queryPageList(PostListForm request, AppUserEntity user);
}

