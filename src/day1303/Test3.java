package day1303;

import java.io.File;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("�����ļ��У� ");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		//�ж��ǲ��� �ļ���
		if(! dir.isDirectory()){
			System.out.println("����Ĳ����ļ���");
			return;
		}
		// �ļ��в����ڣ�������Ȩ�����ļ���
		// ��õ� null ֵ
		String[] names = dir.list();
		File[] files = dir.listFiles();
		if(names == null){
			System.out.println("�޷�����б�");
			return;
		}
		//����
		for (String n : names) {
			System.out.println(n);
		}
		
		System.out.println("------------------------------");

		for (File f : files) {
			System.out.println(f.getName()+" --- "+f.length());
		}
		
	}
}
