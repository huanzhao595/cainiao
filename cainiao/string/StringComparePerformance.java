/**
 * 通过两种方式创建字符串，并测试其性能：
 */
package cainiao.string;

import org.omg.Messaging.SyncScopeHelper;

public class StringComparePerformance {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		for(int i=0; i<50000; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("通过String关键词创建字符串" + " : " + 
		(endTime - startTime) + " 毫秒");
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0; i<50000; i++) {
			String s3 = new String("hello");
			String s4 = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("通过String对象创建字符串" + " : " + 
		(endTime1 - startTime1) + " 毫秒");
	}
	/*
	 * 通过String关键词创建字符串 : 3 毫秒
	          通过String对象创建字符串 : 13 毫秒
	 */

}
