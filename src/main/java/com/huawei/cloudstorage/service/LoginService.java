/**
 * 
 */
package com.huawei.cloudstorage.service;

import com.huawei.cloudstorage.dal.modelDo.UserInfo;

/**
 * @author Administrator
 *
 */
public interface LoginService {

	public UserInfo doLogin(String loginName, String loginPassword);
}
