/**
 * 通过字符串函数 strOrig.lastIndexOf(Stringname) 
 * 来查找子字符串 Stringname 在 strOrig 出现的位置：
 */
package cainiao.string;

public class SearchlastString {
	
	public static void main(String[] args) {
		
		String strOrig = "Hello world ,Hello Runoob";
		int lastIndex = strOrig.lastIndexOf("Runoob");
		if(lastIndex == -1) {
			System.out.println("没有找到字符串Runoob");
		}else {
			System.out.println("Runoob字符串最后出现的位置：" + lastIndex);
		}
	}
}
