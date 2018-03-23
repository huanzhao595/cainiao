/*
 * Java continue 语句语句用来结束当前循环，并进入下一次循环，即仅仅这一次循环结束了，不是所有循环结束了，后边的循环依旧进行。
以下实例使用了 continue 关键字来跳过当前循环并开始下一次循环：
 */
package cainiao.javaMethod;

public class MainClass9 {

	public static void main(String[] args) {

		StringBuffer searchstr = new StringBuffer("hello how are you");
		int length = searchstr.length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (searchstr.charAt(i) != 'h')
				continue;
			count++;
			searchstr.setCharAt(i, 'h');
		}
		System.out.println("发现 " + count + " 个 h 字符");
		System.out.println(searchstr);
	}
	/*
	 * 发现 2 个 h 字符 
	 * hello how are you
	 */
}
