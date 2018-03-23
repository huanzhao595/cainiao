/**
 * 如何使用 contains () 方法来查找数组中的指定元素：
 */
package cainiao.shuZu;

import java.util.ArrayList;

public class Main14 {

	public static void main(String[] args) {

		ArrayList<String> objArray = new ArrayList<String>();
		ArrayList<String> objArray2 = new ArrayList<String>();
		objArray2.add(0, "common1");
		objArray2.add(1, "common2");
		objArray2.add(2, "notcommon");
		objArray2.add(3, "notcommon1");
		objArray.add(0, "common1");
		objArray.add(1, "common2");
		System.out.println("objArray的数组元素：" + objArray);
		System.out.println("objArray2的数组元素：" + objArray2);
		System.out.println("objArray是否包含字符串common2? : " + objArray.contains("common1"));
		System.out.println("objArray2是否包含数组objArray? : " + objArray2.contains(objArray));
	}
	/*
	 * objArray的数组元素：[common1, common2] 
	 * objArray2的数组元素：[common1, common2, notcommon, notcommon1] 
	 * objArray是否包含字符串common2? : true 
	 * objArray2是否包含数组objArray? : false
	 */
}
