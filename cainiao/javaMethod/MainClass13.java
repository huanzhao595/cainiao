/**
 * 在重载方法中使用可变参数：
 */
package cainiao.javaMethod;

public class MainClass13 {

	public static void main(String[] args) {

		vaTest(1, 2, 3);
		vaTest("测试：", 10, 20);
		vaTest(true, false, false);
	}
	/*
	 * vaTest(int ...)参数个数：3,内容： 1 2 3 
	 * vaTest(String,int ...) 测试：参数个数：2,内容： 10 20
	 * vaTest(boolean ...)参数个数：3内容： true false false
	 */

	private static void vaTest(boolean... bl) {

		System.out.println("vaTest(boolean ...)" + "参数个数：" + bl.length + ",内容：");
		for (boolean b : bl)
			System.out.print(b + " ");
		System.out.println();
	}

	private static void vaTest(String msg, int... no) {

		System.out.println("vaTest(String,int ...) " + msg + "参数个数：" + no.length + ",内容：");
		for (int n : no)
			System.out.print(n + " ");
		System.out.println();
	}

	private static void vaTest(int... no) {

		System.out.println("vaTest(int ...)" + "参数个数：" + no.length + ",内容：");
		for (int n : no)
			System.out.print(n + " ");
		System.out.println();
	}
}
