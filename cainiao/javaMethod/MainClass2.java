/**
 * 如何通过重载 MainClass 类的 printArray 方法输出不同类型(整型, 双精度及字符型)的数组：
 */
package cainiao.javaMethod;

public class MainClass2 {

	public static void main(String[] args) {

		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
		System.out.println("输出整型数组：");
		printArray(integerArray);
		System.out.println("\n输出双精度数组");
		printArray(doubleArray);
		System.out.println("\n输出字符型数组");
		printArray(characterArray);
	}

	private static void printArray(Integer[] inputArray) {

		for (Integer element : inputArray) {
			System.out.printf("%s ", element);
			System.out.println();
		}
	}

	private static void printArray(Character[] inputArray) {

		for (Character element : inputArray) {
			System.out.printf("%s ", element);
			System.out.println();
		}
	}

	private static void printArray(Double[] inputArray) {

		for (Double element : inputArray) {
			System.out.printf("%s ", element);
			System.out.println();
		}
	}
	/*
	 * 输出整型数组： 1 2 3 4 5 6
	 * 
	 * 输出双精度数组 1.1 2.2 3.3 4.4 5.5 6.6 7.7
	 * 
	 * 输出字符型数组 H E L L O
	 */

}
