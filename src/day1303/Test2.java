package day1303;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws IOException {
		/*
	       * d:\abc\aa\bb
	       * d:\abc\aa\bb\f1
	       * É¾³ýf1
	       * É¾³ýbb
	       */
		System.out.println("°´»Ø³µ£º ");
		
		new Scanner(System.in).nextLine();
		File dir = new File("d:/abc/aa/bb");
		dir.mkdirs();
		
		new Scanner(System.in).nextLine();
		File file = new File(dir,"f1");
		file.createNewFile();
		
		new Scanner(System.in).nextLine();
		file.delete();
		new Scanner(System.in).nextLine();
		dir.delete();
		
		
	}
	
	
}
