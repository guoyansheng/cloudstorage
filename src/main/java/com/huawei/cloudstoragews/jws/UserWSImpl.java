/**
 * 
 */
package com.huawei.cloudstoragews.jws;

import javax.jws.WebService;

/**
 *
 *
 * @author 测试 E-mail: Administrator
 * @version 测试
 */
@WebService(serviceName = "userWS")
public class UserWSImpl implements UserWS {
	public UserWSImpl() {
		System.out.println("閸掓繂顫愰崠锟� UserWSImpl");
	}

	@Override
	public void getUserById(int id) {
		System.out.println("server getUserById:" + id);
		// return new UserBean(1, "测试");
	}
}
