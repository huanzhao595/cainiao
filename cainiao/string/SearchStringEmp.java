/**
 * 使用了 String 类的 indexOf() 方法在字符串中查找子字符串出现的位置，
 * 如果存在返回字符串出现的位置（第一位为0），如果不存在返回 -1：
 */
package cainiao.string;

public class SearchStringEmp {

	public static void main(String[] args) {
		
		String strOrig = "Google Runoob Taobao";
		int intIndex = strOrig.indexOf("Runoob");
		if(intIndex == -1) {
			System.out.println("没有找到字符串Runoob");
		}else {
			System.out.println("Runoob字符串位置" + intIndex);
		}
	}

}
