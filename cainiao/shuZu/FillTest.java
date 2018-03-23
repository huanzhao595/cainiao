/**
 * 通过 Java Util 类的 Arrays.fill(arrayname,value) 方法和Arrays.fill(arrayname ,starting index ,ending index ,value) 方法向数组中填充元素：
 */
package cainiao.shuZu;

import java.util.Arrays;

public class FillTest {

	public static void main(String[] args) {

		int array[] = new int[6];
		Arrays.fill(array, 100);
		for (int i = 0, n = array.length; i < n; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		Arrays.fill(array, 3, 6, 50);
		for (int i = 0, n = array.length; i < n; i++) {
			System.out.println(array[i]);
		}
	}
	/*
	 * 100 100 100 100 100 100
	 * 
	 * 100 100 100 50 50 50
	 */

}
