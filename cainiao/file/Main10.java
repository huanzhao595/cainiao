/**
 * 使用 File 类的 file.setReadOnly() 和 file.canWrite() 方法来设置文件只读：
 */
package cainiao.file;

import java.io.File;

public class Main10 {

	public static void main(String[] args) {

		File file = new File("d:/java.txt");
		System.out.println(file.setReadOnly());
		System.out.println(file.canWrite());
	}
	/*
	 * true 
	 * false
	 */

}
