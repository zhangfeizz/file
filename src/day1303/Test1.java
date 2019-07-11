package day1303;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		path = "D:\\eclipse-java\\eclipse";   //存在的文件
		//path = "D:\\eclipse-java";   //存在的文件夹
		//path = "c:\\eclipse-java";   //不存在的路径
		File f = new File(path);
		System.out.println(f.length());   //文件字节量，文件夹无效
		System.out.println(f.exists());   //是否存在
		System.out.println(f.isFile());   //是否是文件
		System.out.println(f.isDirectory()); //是否是文件夹
		System.out.println(f.lastModified()); //最后修改时间
		System.out.println(f.getName());      //文件  文件夹 
		System.out.println(f.getParent());    // 父 文件夹
		System.out.println(f.getAbsoluteFile());  // 完整路径
	}
}
