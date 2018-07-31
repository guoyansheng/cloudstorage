/**
 * 
 */
package com.huawei.cloudstorage.web.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huawei.cloudstorage.web.model.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huawei.cloudstorage.service.RegisterService;

/**
 * 注册、补全、激活
 * 
 * @author Administrator
 *
 */
@Controller
public class RegisterController {

	private String REGIST_PAGE = "page/register.jsp";
	@Autowired
	private RegisterService registerService;

	@RequestMapping(value = "/register/doRegister.htm", method = {RequestMethod.GET, RequestMethod.POST})
	public String doRegister(Model model, HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String rpsw = request.getParameter("rpsw");// 得到表单输入的内容
		if (StringUtils.isEmpty(username)) {
			request.setAttribute("msg", "帐号不能为空");
			return REGIST_PAGE;
		}
		if (StringUtils.isEmpty(password)) {
			request.setAttribute("msg", "密码不能为空");
			return REGIST_PAGE;
		}
		if (!password.equals(rpsw)) {
			request.setAttribute("msg", "两次输入的密码不同");
			return REGIST_PAGE;
		}
		UserInfoVO userInfoVO = new UserInfoVO();
		userInfoVO.setNickName(username);
		userInfoVO.setLoginPassword(rpsw);
		userInfoVO.setUserId(String.valueOf(System.currentTimeMillis()));
		userInfoVO.setState("T");
		registerService.register(userInfoVO);
		request.setAttribute("msg", "恭喜：" + username + "，注册成功");
		return REGIST_PAGE;
	}
	@RequestMapping(value = "/register/doActive.htm", method = RequestMethod.POST)
	public String doActive(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		return REGIST_PAGE;
	}
	
	@RequestMapping(value = "/register/doComplete.htm", method = RequestMethod.POST)
	public String doComplete(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		return REGIST_PAGE;
	}
	
	@RequestMapping(value = "/register/doUpdate.htm", method = RequestMethod.POST)
	public String doUpdate(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		return REGIST_PAGE;
	}
}
