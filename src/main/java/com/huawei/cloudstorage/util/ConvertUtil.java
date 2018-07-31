/**
 * 
 */
package com.huawei.cloudstorage.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.util.CollectionUtils;

/**
 * @author Administrator
 *
 */
public class ConvertUtil {

	private static Logger logger = Logger.getLogger(ConvertUtil.class);

	/**
	 * @param source
	 * @param clazz
	 * @return
	 */
	public static <A> A convertFormRepMap(Map<String, String> source, Class<A> clazz) {
		if (CollectionUtils.isEmpty(source)) {
			return null;
		}
		A a = null;
		try {
			a = clazz.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				if (Modifier.isStatic(field.getModifiers()) || field.isSynthetic()) {
					// 静态变量、synthetic 和 父类对象变量忽略
					continue;
				}
				// boolean类型
				if (field.getType().getName().equals("boolean")) {
					field.setBoolean(a, Boolean.valueOf(source.get(field.getName())));
				} else {
					if (null != source.get(field.getName())) {
						field.set(a, source.get(field.getName()));
					}
				}
			}
		} catch (Exception e) {
			logger.error("错误！", e);
		}
		return a;
	}

	/**
	 * 对象属性反射，将对象o中的属性值赋值到对象A中，并返回A
	 * @param o
	 * @param clazz
	 * @return
	 */
	public static <A> A convertBetweenObj(Object o, Class<A> clazz) {
		if (null == o) {
			return null;
		}
		A a = null;
		try {
			a = clazz.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				if (Modifier.isStatic(field.getModifiers()) || field.isSynthetic()) {
					// 静态变量、synthetic 和 父类对象变量忽略
					continue;
				}
				setFeildValue(o, field, a);
			}
		} catch (Exception e) {
			logger.error("错误！", e);
			// throw new Exception();
		}
		return a;
	}

	private static void setFeildValue(Object obj, Field field, Object a) {
		Method m = null;
		try {
			// 如果类型是String
			String filedNameUpper = getMethodName(field.getName());
			if (field.getType().getName().equals("java.lang.String")) {
				// 拿到该属性方法
				m = obj.getClass().getMethod("get" + filedNameUpper);
				field.set(a, m.invoke(obj));
			}
			// 如果类型是boolean
			if (field.getType().getName().equals("boolean") || field.getType().getName().equals("java.lang.Boolean")) {
				// 拿到该属性方法
				m = obj.getClass().getMethod("is" + filedNameUpper);
				field.setBoolean(a, (Boolean) m.invoke(obj));
			}
			// 如果类型是Date
			if (field.getType().getName().equals("java.util.Date")) {
				// 拿到该属性方法
				m = obj.getClass().getMethod("get" + filedNameUpper);
				field.set(a, (Date) m.invoke(obj));
			}

			// 如果类型是int
			if (field.getType().getName().equals("int")) {
				// 拿到该属性方法
				m = obj.getClass().getMethod("get" + filedNameUpper);
				field.set(a, (Integer) m.invoke(obj));
			}

			// 如果类型是double
			if (field.getType().getName().equals("double")) {
				// 拿到该属性方法
				m = obj.getClass().getMethod("get" + filedNameUpper);
				field.set(a, (Double) m.invoke(obj));
			}
		} catch (Exception e) {
			logger.error("对象转换出错！", e);
		}
	}

	private static String getMethodName(String fildeName) {
		byte[] items = fildeName.getBytes();
		items[0] = (byte) ((char) items[0] - 'a' + 'A');
		return new String(items);
	}
}
