/**
 * 通过 String.intern() 方法来优化字符串：
 */
package cainiao.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringOptimization {

	public static void main(String[] args) {

		String variables[] = new String[50000];
		for (int i = 0; i < 50000; i++) {
			variables[i] = "s" + i;
		}

		long startTime0 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = "hello";
		}
		long endTime0 = System.currentTimeMillis();
		System.out.println("直接使用字符串： " + (endTime0 - startTime0) + "ms");

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			variables[i] = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("使用new字符串： " + (endTime1 - startTime1) + "ms");

		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			// variables[i] = new String("hello");
			variables[i] = variables[i].intern();
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("使用字符串对象的intern（）方法： " + (endTime2 - startTime2) + "ms");
	}
	/*
	 * 直接使用字符串： 3ms 
	 * 使用new字符串： 7ms 
	 * 使用字符串对象的intern（）方法： 16ms
	 */
}
