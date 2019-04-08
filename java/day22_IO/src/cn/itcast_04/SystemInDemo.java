package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//标准输入输出流
public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		//不通过Scanner
		BufferedReader br =new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("请输入一个字符串");
		String line = br.readLine();
		System.out.println("您输入的字符是:"+line);
		System.out.println("请输入一个数字:");
		int i =Integer.parseInt(br.readLine());
		System.out.println("您输入的数字是:"+i);
	}

}
