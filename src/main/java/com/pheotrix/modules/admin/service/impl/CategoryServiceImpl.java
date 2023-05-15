package com.pheotrix.modules.admin.service.impl;

import com.pheotrix.common.exception.MyException;
import com.pheotrix.modules.admin.dao.CategoryDao;
import com.pheotrix.modules.admin.entity.CategoryEntity;
import com.pheotrix.modules.admin.entity.PostEntity;
import com.pheotrix.modules.admin.service.CategoryService;
import com.pheotrix.modules.admin.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.common.utils.Query;

import org.springframework.transaction.annotation.Transactional;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    private PostService postService;


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    /**
     * 分类保存
     *
     * @param category
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveCategory(CategoryEntity category) {
        Integer count = this.lambdaQuery().eq(CategoryEntity::getCateName, category.getCateName()).count();
        if (count != 0) {
            throw new MyException("分类名不能重复");
        }
        this.save(category);
    }

    /**
     * 删除分类
     *
     * @param list
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByIdList(List<Integer> list) {
        list.forEach(id -> {
            Integer count = postService.lambdaQuery().eq(PostEntity::getCut, id).count();
            if (count > 0) {
                CategoryEntity category = this.getById(id);
                throw new MyException(category.getCateName() + "分类下存在帖子未删除");
            }
        });
        this.removeByIds(list);
    }

}