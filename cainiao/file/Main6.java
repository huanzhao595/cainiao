/**
 * 使用 File 类的 createTempFile(String prefix, String suffix); 方法在默认临时目录来创建临时文件，参数 prefix 为前缀，suffix 为后缀：
 */
package cainiao.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main6 {

	public static void main(String[] args) throws IOException {

		/*File temp;
		try {
			temp = File.createTempFile("testrunoobtmp", ".txt", new File("D:/"));
			System.out.println("文件路径：" + temp.getAbsolutePath());
			temp.deleteOnExit();
			BufferedWriter out = new BufferedWriter(new FileWriter(temp));
			out.write("aString");
			System.out.println("临时文件已创建：");
			out.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}*/
		
		creat();
		
	}
	/*
	 * 也可以使用 createTempFile(String prefix, String suffix, File directory) 中的 directory 参数来指定临时文件的目录：
	 */
	public static void creat() throws IOException {
		File f = null;
		//创建临时文件
		f = File.createTempFile("tmp", ".txt", new File("d:/"));
		//输出绝对路径
		System.out.println("File path:" + f.getAbsolutePath());
		//终止后删除临时文件
		f.deleteOnExit();
		//创建临时文件
		f = File.createTempFile("tmp", null, new File("D:/"));
		//输出绝对路径
		System.out.println("File path:" + f.getAbsolutePath());
		//终止后删除临时文件
		f.deleteOnExit();
	}

}
