/**
 * 演示了如何使用 remove () 方法来删除数组元素：
 */
package cainiao.shuZu;

import java.util.ArrayList;

public class Main11 {

	public static void main(String[] args) {
		
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.clear();
		objArray.add(0,"第0个元素");
		objArray.add(1,"第1个元素");
		objArray.add(2,"第2个元素");
		System.out.println("数组删除元素前：" + objArray);
		objArray.remove("第0个元素");
		System.out.println("数组删除元素后：" + objArray);
	}

}
