/**
 * 使用 File 类的 fileToChange.lastModified() 和 fileToChange setLastModified() 方法来修改文件最后的修改日期
 */
package cainiao.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main7 {

	public static void main(String[] args) throws IOException {

		File fileToChange = new File("d:/person.txt");
		fileToChange.createNewFile();

		Date filetime = new Date(fileToChange.lastModified());
		System.out.println(filetime.toString());
		System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));

		filetime = new Date(fileToChange.lastModified());
		System.out.println(filetime.toString());
	}
	/*
	 * Wed Jan 31 15:04:09 CST 2018 
	 * true 
	 * Fri Mar 23 22:04:33 CST 2018
	 */

}
