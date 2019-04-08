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
		// �����������������
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		int i = raf.readInt();
		System.out.println(i);
		System.out.println("ָ��λ����"+raf.getFilePointer());
		
		char c = raf.readChar();
		System.out.println(c);
		System.out.println("ָ��λ����"+raf.getFilePointer());
		
		//�����ͷ��ʼ,ֱ�Ӷ�ȡa
		raf.seek(4);  //����ָ��λ�õ�4��ʼ��ȡ
		c=raf.readChar();
		System.out.println(c);
		
		
	}

	private static void write() throws IOException {
		// �����������������
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("�й�");
	}
}
