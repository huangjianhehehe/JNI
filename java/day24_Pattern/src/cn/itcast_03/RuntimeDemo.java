package cn.itcast_03;

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r=Runtime.getRuntime();
		//r.exec("notepad");
//		r.exec("calc");
//		r.exec("shutdown -s -t 10000");
		r.exec("shutdown -a");
	}
}
