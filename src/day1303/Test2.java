package day1303;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws IOException {
		/*
	       * d:\abc\aa\bb
	       * d:\abc\aa\bb\f1
	       * ɾ��f1
	       * ɾ��bb
	       */
		System.out.println("���س��� ");
		
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
