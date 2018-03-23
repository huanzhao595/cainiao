/**
 * 使用 Collections.reverse(ArrayList) 将数组进行反转：
 */
package cainiao.shuZu;

import java.util.ArrayList;
import java.util.Collections;

public class Main4 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("反转前排序：" + arrayList);
		Collections.reverse(arrayList);
		System.out.println("反转后排序：" + arrayList);
	}
	/*
	 * 反转前排序：[A, B, C, D, E] 
	 * 反转后排序：[E, D, C, B, A]
	 */
}
