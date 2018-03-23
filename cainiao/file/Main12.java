/**
 * 使用 File 类的 file.createTempFile() 方法在指定目录中创建文件：
 */
package cainiao.file;

import java.io.File;
import java.io.IOException;

public class Main12 {

	public static void main(String[] args) throws IOException {

		File file = null;
		File dir = new File("d:/");
		file = File.createTempFile("javaTemp", ".javatemp", dir);
		System.out.println(file.getPath());
	}
	/*
	 * d:\javaTemp2684620949953350921.javatemp
	 */

}
