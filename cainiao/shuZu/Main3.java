/**
 * 使用数组的属性 length 来获取数组的长度。
 * 以下实例中我们定义了二维数组，并获取数组的长度：
 */
package cainiao.shuZu;

public class Main3 {

	public static void main(String[] args) {

		String[][] data = new String[2][5];
		System.out.println("第一维数组长度：" + data.length);
		System.out.println("第二维数组长度：" + data[0].length);
	}
	/*
	 * 第一维数组长度：2
	 * 第二维数组长度：5
	 */
}
