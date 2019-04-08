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
		//由于我们要对对象进行序列化,先自定义一个类
		//序列化数据其实就是把对象写到文本文件
//		write();
		read();
	}

	private static void read() throws Exception, IOException {
		// 创建反序列化对象
		ObjectInputStream ois = new ObjectInputStream(new 
				FileInputStream("oos.txt"));
		//还原
		Person p1=(Person)ois.readObject();
		ois.close();
		System.out.println(p1);
		
	}

	private static void write() throws IOException, IOException {
		// 创建序列化流对象
		ObjectOutputStream oos = new ObjectOutputStream(new 
				FileOutputStream("oos.txt"));
		//创建对象
		Person p = new Person("莞纫紫",27);
		//写入对象
		oos.writeObject(p);
		//释放资源
		oos.close();
		
	}

}
