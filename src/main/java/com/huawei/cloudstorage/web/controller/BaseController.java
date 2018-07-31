/**
 * 
 */
package com.huawei.cloudstorage.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;

/**
 * @author Administrator
 *
 */
public class BaseController {
	private static Logger logger = LoggerFactory.getLogger(BaseController.class);

	/**
	 * 处理json返回，异步请求专用
	 * 
	 * @param model
	 * @param response
	 */
	public void returnModel(Model model, HttpServletResponse response) {
		try {
			// 设置页面不缓存
			response.setContentType("application/json");
			response.setHeader("Pragma", "No-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = null;
			out = response.getWriter();
			out.print(model);
			out.flush();
			out.close();
		} catch (IOException e) {
			logger.error("json返回出错;", e);
			e.printStackTrace();
		}

	}
}
