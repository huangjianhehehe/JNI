package cn.itcast_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//打印流的改进版
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br = new BufferedReader(new 
				FileReader("PrintWriterDemo.java"));
		//封装目的地
		PrintWriter pw = new PrintWriter(new FileWriter
				("Copy.java"),true);
		//执行复制操作
		String line=null;
		while((line=br.readLine())!=null) {
			pw.println(line);
		}
		br.close();
		pw.close();
		System.out.println("复制完成OK");
		
		
	}
}
