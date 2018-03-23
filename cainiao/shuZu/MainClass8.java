/**
 * 在 java 中找到重复的元素：
 */
package cainiao.shuZu;

public class MainClass8 {

	public static void main(String[] args) {

		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };

		for (int i = 0; i < my_array.length; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if ((my_array[i] == my_array[j]) && (i != j)) {
					System.out.println("重复元素：" + my_array[j]);
				}
			}
		}
		/*
		 * 重复元素：2 
		 * 重复元素：5 
		 * 重复元素：6
		 */
	}

}
