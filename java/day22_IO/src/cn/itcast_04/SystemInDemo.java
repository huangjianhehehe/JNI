package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//��׼���������
public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		//��ͨ��Scanner
		BufferedReader br =new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("������һ���ַ���");
		String line = br.readLine();
		System.out.println("��������ַ���:"+line);
		System.out.println("������һ������:");
		int i =Integer.parseInt(br.readLine());
		System.out.println("�������������:"+i);
	}

}
