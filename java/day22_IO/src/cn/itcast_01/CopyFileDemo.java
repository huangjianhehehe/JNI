package cn.itcast_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//��ӡ���ĸĽ���
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//��װ����Դ
		BufferedReader br = new BufferedReader(new 
				FileReader("PrintWriterDemo.java"));
		//��װĿ�ĵ�
		PrintWriter pw = new PrintWriter(new FileWriter
				("Copy.java"),true);
		//ִ�и��Ʋ���
		String line=null;
		while((line=br.readLine())!=null) {
			pw.println(line);
		}
		br.close();
		pw.close();
		System.out.println("�������OK");
		
		
	}
}
