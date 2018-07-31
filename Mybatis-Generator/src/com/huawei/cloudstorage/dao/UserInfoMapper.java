package com.huawei.cloudstorage.dal.dao;

import com.huawei.cloudstorage.dal.modelDo.UserInfo;
import com.huawei.cloudstorage.dal.modelDo.UserInfoExample;

public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}