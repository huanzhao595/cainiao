/**
 * 如何通过循环输出数组：
 */
package cainiao.shuZu;

public class Welcome {

	public static void main(String[] args) {

		String[] greeting = new String[3];
		greeting[0] = "菜鸟教程";
		greeting[1] = "菜鸟工具";
		greeting[2] = "菜鸟笔记";
		for (int i = 0; i < greeting.length; i++) {
			System.out.println(greeting[i]);
		}
	}
	/*
	 * 菜鸟教程
	 * 菜鸟工具 
	 * 菜鸟笔记
	 */

}
