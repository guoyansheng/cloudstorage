/**
 * 
 */
package com.huawei.cloudstorage.service.impl;

import java.util.Date;

import com.huawei.cloudstorage.dal.dao.UserInfoMapper;
import com.huawei.cloudstorage.dal.modelDo.UserInfo;
import com.huawei.cloudstorage.web.model.UserInfoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.StringUtils;

import com.huawei.cloudstorage.service.RegisterService;
import com.huawei.cloudstorage.util.DateUtil;

/**
 * 娉ㄥ唽銆佽ˉ鍏ㄣ�佹縺娲�
 * 
 * @author Administrator
 *
 */
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private TransactionTemplate transactionTemplate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.huawei.cloudstorage.service.RegisterService#register(com.huawei.cloudstorage.model.modelVo.UserInfoVO)
	 */
	@Override
	public UserInfoVO register(final UserInfoVO userVO) {
		final UserInfoVO userVO2 = new UserInfoVO();
		transactionTemplate.execute(new TransactionCallback<UserInfoVO>() {
			@Override
			public UserInfoVO doInTransaction(TransactionStatus status) {
				// 1.瀵硅薄杞崲
				UserInfo user = new UserInfo();
				BeanUtils.copyProperties(userVO, user);
				String birthdateStr = userVO.getBirthdateStr();
				if(!StringUtils.isEmpty(userVO.getBirthdateStr())){
					Date birthdate = DateUtil.stringToDate(userVO.getBirthdateStr(), DateUtil.patternA);
					user.setBirthdate(birthdate);
				}
				
				// 2.鎻掑叆鏁版嵁
				//杩斿洖鐨勪富閿湪User.id涓�
				userInfoMapper.insert(user);
				// 3.鏌ヨ鏁版嵁
				user = userInfoMapper.selectByPrimaryKey(user.getId());
				BeanUtils.copyProperties(user, userVO2);
				userVO.setBirthdateStr(birthdateStr);
				// TODO Auto-generated method stub
				return null;
			}
		});

		return userVO2;
	}

}
