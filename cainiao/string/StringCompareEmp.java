/**
 * 以下实例中我们通过字符串函数 compareTo (string) ，
 * compareToIgnoreCase(String) 及 compareTo(object string) 
 * 来比较两个字符串，并返回字符串中第一个字母ASCII的差值。
 */
package cainiao.string;

public class StringCompareEmp {

	public static void main(String[] args) {

		String str = "Hello World";
		String anotherString = "hello world";
		Object objStr = str;

		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objStr.toString()));// 忽略大小写
	}
	/*
	 * -32
	 * 0 
	 * 0
	 */

}
