/**
 * 一个正整数的阶乘（英语：factorial）是所有小于及等于该数的正整数的积，并且有0的阶乘为1。自然数n的阶乘写作n!。
	亦即n!=1×2×3×...×n。阶乘亦可以递归方式定义：0!=1，n!=(n-1)!×n。
 */
package cainiao.javaMethod;

public class MainClass5 {

	public static void main(String[] args) {

		for (int counter = 0; counter <= 10; counter++) {
			System.out.printf("%d != %d\n", counter, factorial(counter));
		}
	}
	/*
	 * 0 != 1 
	 * 1 != 1 
	 * 2 != 2 
	 * 3 != 6 
	 * 4 != 24 
	 * 5 != 120 
	 * 6 != 720 
	 * 7 != 5040 
	 * 8 != 40320 
	 * 9 != 362880 
	 * 10 != 3628800
	 */

	private static long factorial(int number) {

		if (number <= 1) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}
}
