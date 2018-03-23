/**
 * 使用了 String toUpperCase() 方法将字符串从小写转为大写
 */
package cainiao.string;

public class StringToUpperCaseEmp {
	
	public static void main(String[] args) {
		
		String str = "string runoob";
		String strUpper = str.toUpperCase();
		System.out.println("原始字符串： " + str);
		System.out.println("转换为大写： " + strUpper);
	}
}
