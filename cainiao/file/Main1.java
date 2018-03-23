/**
 * 使用 write() 方法向文件写入内容：
 */
package cainiao.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args) {

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("test.log"));
			out.write("菜鸟教程");
			out.close();
			System.out.println("文件创建成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
