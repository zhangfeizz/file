package day1303;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		path = "D:\\eclipse-java\\eclipse";   //���ڵ��ļ�
		//path = "D:\\eclipse-java";   //���ڵ��ļ���
		//path = "c:\\eclipse-java";   //�����ڵ�·��
		File f = new File(path);
		System.out.println(f.length());   //�ļ��ֽ������ļ�����Ч
		System.out.println(f.exists());   //�Ƿ����
		System.out.println(f.isFile());   //�Ƿ����ļ�
		System.out.println(f.isDirectory()); //�Ƿ����ļ���
		System.out.println(f.lastModified()); //����޸�ʱ��
		System.out.println(f.getName());      //�ļ�  �ļ��� 
		System.out.println(f.getParent());    // �� �ļ���
		System.out.println(f.getAbsoluteFile());  // ����·��
	}
}
