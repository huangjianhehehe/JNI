package cn.itcast_05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.WriteAbortedException;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
//		write();
		read();
	}

	private static void read() throws IOException {
		// 创建随机访问流对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		int i = raf.readInt();
		System.out.println(i);
		System.out.println("指针位置是"+raf.getFilePointer());
		
		char c = raf.readChar();
		System.out.println(c);
		System.out.println("指针位置是"+raf.getFilePointer());
		
		//不想从头开始,直接读取a
		raf.seek(4);  //设置指针位置到4开始读取
		c=raf.readChar();
		System.out.println(c);
		
		
	}

	private static void write() throws IOException {
		// 创建随机访问流对象
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("中国");
	}
}
