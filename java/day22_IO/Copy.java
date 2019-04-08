package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// 作为writer的子类使用
		PrintWriter pw = new PrintWriter("pw.txt");
		
		pw.write("hello");
		pw.write("world");
		pw.write("java");
		
		pw.close();
	}

}
