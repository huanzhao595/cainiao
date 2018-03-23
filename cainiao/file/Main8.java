/**
 * 使用 File 类的 file.exists() 和 file.length() 方法来获取文件大小，以字节计算（1KB=1024字节 ）：
 */
package cainiao.file;

import java.io.File;

public class Main8 {

	public static void main(String[] args) {

		long size = getFileSize("d:/java.txt");
		System.out.println("java.txt文件大小为：" + size);
	}

	private static long getFileSize(String filename) {
		
		File file = new File(filename);
		if(!file.exists() || !file.isFile()) {
			System.out.println("file is not exist");
			return -1;
		}
		return file.length();
	}

}
