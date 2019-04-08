package cn.itcast_07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.WriteAbortedException;

public class ObjectStreamDemo {
	public static void main(String[] args) throws Exception {
		//��������Ҫ�Զ���������л�,���Զ���һ����
		//���л�������ʵ���ǰѶ���д���ı��ļ�
//		write();
		read();
	}

	private static void read() throws Exception, IOException {
		// ���������л�����
		ObjectInputStream ois = new ObjectInputStream(new 
				FileInputStream("oos.txt"));
		//��ԭ
		Person p1=(Person)ois.readObject();
		ois.close();
		System.out.println(p1);
		
	}

	private static void write() throws IOException, IOException {
		// �������л�������
		ObjectOutputStream oos = new ObjectOutputStream(new 
				FileOutputStream("oos.txt"));
		//��������
		Person p = new Person("ݸ����",27);
		//д�����
		oos.writeObject(p);
		//�ͷ���Դ
		oos.close();
		
	}

}
