/**
 * Java break 语句可以直接强行退出当前的循环，忽略循环体中任何其他语句和循环条件测试。
          以下实例使用了 break 关键字来跳出当前循环：
 */
package cainiao.javaMethod;

public class MainClass8 {

	public static void main(String[] args) {
		
		int[] intary = { 99,12,22,34,45,67,5678,8990};
		int no = 5678;
		int i = 0;
		boolean found = false;
		for( ; i < intary.length; i++) {
			if(intary[i] == no) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println(no + " 元素的索引位置在：" + i);
		}else {
			System.out.println(no + " 元素不在数组");
		}
	}
	/*
	 * 5678 元素的索引位置在：6
	 */
}
