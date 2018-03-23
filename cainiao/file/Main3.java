/**
 * 演示了使用 delete() 方法将文件删除：需要在 C 盘上先创建 test.txt 文件
 */
package cainiao.file;

import java.io.File;

public class Main3 {

	public static void main(String[] args) {
		
		File file = new File("c:\\test.txt");
		if(file.delete()) {
			System.out.println(file.getName() + " 文件已被删除！");
		}else {
			System.out.println("文件删除失败！");
		}
	}
	/*
	 * test.txt 文件已被删除！
	 */

}
