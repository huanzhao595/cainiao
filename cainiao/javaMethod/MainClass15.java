/**
 * for 语句比较简单，用于循环数据。
for循环执行的次数是在执行前就确定的。语法格式如下：
 */
package cainiao.javaMethod;

public class MainClass15 {

	public static void main(String[] args) {
		
		int[] intary = {1, 2, 3, 4};
		forDisplay(intary);
		foreachDisplay(intary);
	}

	private static void foreachDisplay(int[] data) {
		System.out.println("使用foreach循环数组");
		for(int a : data) {
			System.out.println(a + " ");
		}
	}

	private static void forDisplay(int[] data) {
		System.out.println("使用for循环数组");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}
