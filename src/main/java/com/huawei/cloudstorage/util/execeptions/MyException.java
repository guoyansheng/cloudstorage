/**
 * 
 */
package com.huawei.cloudstorage.util.execeptions;

/**
 * @author Administrator
 *
 */
public class MyException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1528995801358756051L;
	private String message;
	
	public MyException(String msg){
		this.message = msg;
	}
}
