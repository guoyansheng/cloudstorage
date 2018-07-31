/**
 * 
 */
package com.huawei.cloudstorage.convert;

import java.lang.reflect.Field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Administrator
 * @param <T>
 *
 */
public class ConvertUtil {

	private static Logger logger = LoggerFactory.getLogger(ConvertUtil.class);

	public static  <A> A voToDo(Object o, Class target) {
		A targetObject = null;
		try {
			targetObject = (A) target.newInstance();
			Field[] fields = o.getClass().getFields();
			Field[] fieldtarget = fields;
			for(int i = 0 ; i < fields.length ; i++){
				if(fields[i].getName().equals("serialVersionUID")){
					continue;
				}
				if(fields[i].getType().equals("Date")){
					//targetObject.getClass();
				}
			}
			Field[] fields2 = targetObject.getClass().getFields();
			fields2 = fieldtarget;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			logger.error("对象转换错误", e);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			logger.error("对象转换错误", e);
			e.printStackTrace();
		}
		
		return targetObject;
	}
}
