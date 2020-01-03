package com.wanganning.util;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 锟斤拷锟斤拷锟斤拷
 * @author: charles
 * @date: 2020锟斤拷1锟斤拷3锟斤拷 锟斤拷锟斤拷9:38:57
 */
public class StreamUtil {

	/**
	 * 
	 * @Title: readLine 
	 * @Description: 锟斤拷取锟侥硷拷
	 * @param ins
	 * @return
	 * @return: List<String>
	 */
	public static List<String> readLine(InputStream in){
		List<String> list = new ArrayList<String>();
		   BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		   String str=null;
		   try {
			while((str=reader.readLine())!=null) {
				list.add(str);
			   }
		} catch (IOException e) {
			e.printStackTrace();
		}
		   return list;
	}
}
