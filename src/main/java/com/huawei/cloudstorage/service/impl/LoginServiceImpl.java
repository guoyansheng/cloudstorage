/**
 * 
 */
package com.huawei.cloudstorage.service.impl;

import com.huawei.cloudstorage.dal.modelDo.UserInfo;
import org.springframework.stereotype.Service;

import com.huawei.cloudstorage.service.LoginService;

/**
 * @author Administrator
 *
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService{

	/* (non-Javadoc)
	 * @see com.huawei.cloudstorage.service.LoginService#doLogin(java.lang.String, java.lang.String)
	 */
	@Override
	public UserInfo doLogin(String loginName, String loginPassword) {
		// TODO Auto-generated method stub
		UserInfo user = new UserInfo();
		
		return user;
	}

}
