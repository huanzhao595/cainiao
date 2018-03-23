/**
 * 通过字符串函数 substring() 函数来删除字符串中的一个字符
 */
package cainiao.string;

public class RemoveCharAt {
	
	public static void main(String[] args) {
		
		String str = "this is Java";
		System.out.println(removeCharAt(str, 3));
	}
	
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}
}
