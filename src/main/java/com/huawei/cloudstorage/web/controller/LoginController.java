/**
 * 
 */
package com.huawei.cloudstorage.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.huawei.cloudstorage.dal.modelDo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.huawei.cloudstorage.constants.GlobalConstant;
import com.huawei.cloudstorage.util.execeptions.MyException;
import com.huawei.cloudstorage.service.LoginService;

/**
 * @author Administrator
 *
 */
@Controller
public class LoginController {
	  @Resource
	  LoginService loginService;
	   
	  @Resource
	  HttpServletRequest request;
	   
	  @RequestMapping("/exception")
	  public void exception() throws MyException{
	    throw new MyException("测试springmvc中的异常捕获");
	  }
	   
	  @RequestMapping("/loginpage")
	  public String toLoginPage(){
	    return "/WEB-INF/jsp/login.jsp";
	  }
	   
	  @RequestMapping("/user/home")
	  public String toUserHome(){
	    return "/WEB-INF/jsp/userhome.jsp";
	  }
	   
	  @RequestMapping("/logout")
	  public String logout(){
	    request.getSession().removeAttribute(GlobalConstant.SIMPLE_USER_SESSION_KEY);
	    return "redirect:/";
	  }
	   
	  @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	  public String doLogin(@RequestParam String userName, @RequestParam String loginPassword){
	     
	    try {
	      UserInfo user = loginService.doLogin(userName, loginPassword);
	      request.getSession().setAttribute(GlobalConstant.SIMPLE_USER_SESSION_KEY, user);
	      return "redirect:/user/home.html";
	    } catch (Exception e) {
	      return "/WEB-INF/jsp/login.jsp";
	    }
	     
	  }
	   
	}
