/**
 * 通过 "+" 操作符和StringBuffer.append() 方法来连接字符串，并比较其性能
 */
package cainiao.string;

public class StringConcatenate {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			String result = "This is" + "testing the" + "difference" + "betwwn" + "String" + "and" + "StringBuffer";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("字符串连接" + " --- 使用 + 操作符 : " + (endTime - startTime) + "ms");

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			StringBuffer result = new StringBuffer();
			result.append("This is");
			result.append("testing the");
			result.append("difference");
			result.append("betwwn");
			result.append("String");
			result.append("and");
			result.append("StringBuffer");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("字符串连接" + " --- 使用 StringBuffer : " + (endTime1 - startTime1) + "ms");
	}
	/*
	 * 字符串连接 --- 使用 + 操作符 : 0ms 
	 * 字符串连接 --- 使用 StringBuffer : 0ms
	 */

}
