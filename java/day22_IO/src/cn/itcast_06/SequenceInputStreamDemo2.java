package cn.itcast_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 *     合并多个文件到一个文件中
 * 
  */
public class SequenceInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//通过集合保存三个文件对象
		Vector<InputStream> v= new Vector<InputStream>();
		v.add(new FileInputStream("Copy.txt"));
		v.add(new FileInputStream("pw.txt"));
		v.add(new FileInputStream("raf.txt"));
		//Enumeration<InputStream> en =v.elements();
		SequenceInputStream sis = new SequenceInputStream(v.elements());
		BufferedOutputStream bos = new BufferedOutputStream(new
				FileOutputStream("Copy2.txt"));
		byte [] bys = new byte[1024];
		int len=0;
		while((len=sis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		bos.close();
	}
}
