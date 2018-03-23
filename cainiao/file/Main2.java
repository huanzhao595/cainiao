/**
 * 演示了使用 readLine() 方法来读取文件 test.log 内容，其中 test.log 文件内容为：
 */
package cainiao.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new FileReader("test.log"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println(str);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	/*
	 * 菜鸟教程 
	 * www.runoob.com 
	 * null
	 */

}
