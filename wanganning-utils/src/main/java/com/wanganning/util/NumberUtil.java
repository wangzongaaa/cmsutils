package com.wanganning.util;
/**
 * 
 * @ClassName: NumberUtil 
 * @Description: TODO
 * @author: charles
 * @date: 2020锟斤拷1锟斤拷3锟斤拷 锟斤拷锟斤拷10:23:15
 */
public class NumberUtil {

	/**
	 * 
	 * @Title: isNumber 
	 * @Description: 锟叫讹拷锟角凤拷锟斤拷锟斤拷锟斤拷
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isNumber(String src) {
		String reg ="^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}

	
}
