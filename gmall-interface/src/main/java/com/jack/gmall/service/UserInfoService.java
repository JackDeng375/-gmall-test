package com.jack.gmall.service;

import com.jack.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

   List<UserInfo> findAll();

   List<UserInfo> findLikeUserList();

   //新增用户
   void addUserInfo(UserInfo userInfo);

   //通过id修改
   void upd(UserInfo userInfo);
}
