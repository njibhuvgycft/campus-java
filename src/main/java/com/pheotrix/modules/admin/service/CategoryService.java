package com.pheotrix.modules.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.modules.admin.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author pheotrix
 * @email 3582996245@qq.com
 * @date 2022-01-21 14:32:52
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveCategory(CategoryEntity category);

    void deleteByIdList(List<Integer> list);
}

