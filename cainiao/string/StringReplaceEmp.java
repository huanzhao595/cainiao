/**
 * 使用 java String 类的 replace 方法来替换字符串中的字符
 */
package cainiao.string;

public class StringReplaceEmp {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		System.out.println(str.replace('H', 'W'));
		System.out.println(str.replaceFirst("He", "We"));
		System.out.println(str.replaceAll("He", "Ha"));
	}
}
