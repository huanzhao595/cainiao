/**
 * 斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……
	特别指出：第0项是0，第1项是第一个1。
	这个数列从第三项开始，每一项都等于前两项之和。
 */
package cainiao.javaMethod;

public class MainClass4 {

	public static void main(String[] args) {

		for (int counter = 0; counter <= 10; counter++) {
			System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
		}
	}
	/*
	 * Fibonacci of 0 is: 0 
	 * Fibonacci of 1 is: 1 
	 * Fibonacci of 2 is: 1 
	 * Fibonacci of 3 is: 2 
	 * Fibonacci of 4 is: 3 
	 * Fibonacci of 5 is: 5 
	 * Fibonacci of 6 is: 8
	 * Fibonacci of 7 is: 13 
	 * Fibonacci of 8 is: 21 
	 * Fibonacci of 9 is: 34 
	 * Fibonacci of 10 is: 55
	 */

	public static long fibonacci(long number) {
		if ((number == 0) || (number == 1))
			return number;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);

	}
}
