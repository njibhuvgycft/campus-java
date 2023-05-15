package com.pheotrix.modules.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pheotrix.modules.admin.entity.AppUserEntity;
import com.pheotrix.common.vo.AppUserInfoResponse;
import com.pheotrix.common.vo.AppUserRankResponse;
import com.pheotrix.common.vo.AppUserResponse;
import com.pheotrix.common.vo.HomeRateResponse;
import com.pheotrix.common.utils.AppPageUtils;
import com.pheotrix.common.utils.PageUtils;
import com.pheotrix.modules.app.param.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author pheotrix
 * @email 3582996245@qq.com
 * @date 2022-01-20 12:10:43
 */
public interface AppUserService extends IService<AppUserEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void ban(Integer id);

    void openBan(Integer id);

    /**
     * 首页数据
     * @return HomeRateResponse
     */
    HomeRateResponse indexDate();

    Integer smsLogin(SmsLoginForm form, HttpServletRequest request);

    String sendSmsCode(SendCodeForm param);

    AppUserResponse getUserInfo(AppUserEntity user);

    void updateAppUserInfo(AppUserUpdateForm appUserUpdateForm, AppUserEntity user);

    void addFollow(AddFollowForm request, AppUserEntity user);

    void cancelFollow(AddFollowForm request, AppUserEntity user);

    AppPageUtils userFans(Integer page, Integer uid);

    AppPageUtils follow(Integer page, AppUserEntity user);

    AppUserInfoResponse findUserInfoById(Integer uid, AppUserEntity user);

    Integer miniWxLogin(WxLoginForm form);

    List<AppUserRankResponse> userRank();
}

