package cn.itcast_06;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//建两个流对象
		InputStream s1 = new FileInputStream("pw.txt");
		InputStream s2 = new FileInputStream("raf.txt");
		//合并
		SequenceInputStream sis	= new SequenceInputStream(s1,s2);
		BufferedOutputStream bos = new BufferedOutputStream(new 
				FileOutputStream("Copy.txt")); //建目标文件对象
		//写入
		byte[] bys = new byte[1024];
		int len=0;
		while((len=sis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		sis.close();
		
	}

}
