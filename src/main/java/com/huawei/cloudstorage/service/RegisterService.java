/**
 * 
 */
package com.huawei.cloudstorage.service;


import com.huawei.cloudstorage.web.model.UserInfoVO;

/**
 * 注册、补全、激活
 * 
 * @author Administrator
 *
 */
public interface RegisterService {
	/**
	 * 注册
	 * @param userInfoVO
	 * @return
	 */
	public UserInfoVO register(UserInfoVO userInfoVO);
}
