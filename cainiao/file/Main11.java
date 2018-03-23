/**
 * 使用 File 类的 file.exists() 方法来检测文件是否存在：
 */
package cainiao.file;

import java.io.File;

public class Main11 {

	public static void main(String[] args) {

		File file = new File("d:/java.txt");
		System.out.println(file.exists());
	}

}
