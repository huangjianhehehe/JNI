package cn.itcast_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();

		//		load() �����ļ��е�����
		//		Reader r=new FileReader("prop.txt");
		//		prop.load(r);
		//		r.close();
		//		System.out.println(prop);
		
		//store() �Ѽ����е����ݴ洢���ļ���
		//���Ԫ��
		prop.setProperty("����", "30");
		prop.setProperty("����", "39");
		prop.setProperty("����", "41");
		
		prop.store(new FileWriter("name.txt"), null);

		}
	}

