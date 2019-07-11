package day1303;

import java.io.File;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("输入文件夹： ");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		//判断是不是 文件夹
		if(! dir.isDirectory()){
			System.out.println("输入的不是文件夹");
			return;
		}
		// 文件夹不存在，或者无权进入文件夹
		// 会得到 null 值
		String[] names = dir.list();
		File[] files = dir.listFiles();
		if(names == null){
			System.out.println("无法获得列表");
			return;
		}
		//遍历
		for (String n : names) {
			System.out.println(n);
		}
		
		System.out.println("------------------------------");

		for (File f : files) {
			System.out.println(f.getName()+" --- "+f.length());
		}
		
	}
}
