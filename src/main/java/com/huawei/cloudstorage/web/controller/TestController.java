/**
 * 
 */
package com.huawei.cloudstorage.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


/**
 * @author Administrator
 *
 */
@Controller
public class TestController extends BaseController {
	private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/test1.htm",method = RequestMethod.GET )
    public String test1Get(HttpServletRequest request, ModelMap model){
        model.addAttribute("persons", "get");
        request.setAttribute("persons","persons111");
        model.put("persons","get");
        //返回vm页面时返回字符串结尾不要加“.vm”,bean=velocityViewResolver 有配置自动补充“.vm”;便于与其他前段页面区分，如：“.jsp”、“。html”
        return "templates/hello";
    }
	@RequestMapping(value = "/test1.htm",method = RequestMethod.POST )
    public String test1Post(ModelMap model){
        model.addAttribute("persons", "post");
        return "hello";
    }
}
