/**
 * 
 */
package com.huawei.cloudstoragews.service;

import com.name3.name3_facade.CXFService;
import org.apache.log4j.Logger;

import javax.jws.WebService;

/**
 *
 *
 * @author 娴ｆ粏锟斤拷 E-mail: Administrator
 * @version
 */
@WebService(serviceName = "cxfService")
public class CXFServiceImpl implements CXFService {
	private static Logger logger = Logger.getLogger(CXFServiceImpl.class);

	public String hello(String name) {
		logger.info("-------------------------------------------\n");
		System.out.println("com.huawei.cloudstoragews.service.CXFServiceImpl.hello()执行成功:" + name);
		return "com.huawei.cloudstoragews.service.CXFServiceImpl.hello()执行成功:" + name;
	}
}
