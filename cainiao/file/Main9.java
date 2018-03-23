/**
 * 使用 File 类的 oldName.renameTo(newName) 方法来重命名文件：
 */
package cainiao.file;

import java.io.File;

public class Main9 {

	public static void main(String[] args) {

		File oldName = new File("d:/person.txt");
		File newName = new File("d:/java.txt");
		if(oldName.renameTo(newName)) {
			System.out.println("已重命名");
		}else {
			System.out.println("Error");
		}
	}

}
