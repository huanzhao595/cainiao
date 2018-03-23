/**
 * 演示了使用 filewriter 方法向文件中追加数据：
 */
package cainiao.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) {

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
			out.write("aString\n");
			out.close();
			out = new BufferedWriter(new FileWriter("filename", true));
			out.write("aString2");
			out.close();
			BufferedReader in = new BufferedReader(new FileReader("filename"));
			String str;
			while((str = in.readLine()) != null) {
				System.out.println(str);
			}
			in.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
