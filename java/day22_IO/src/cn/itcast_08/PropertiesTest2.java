package cn.itcast_08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * ����һ��С����,��������ֻ������5��,����5����Ϸ����,�븶��
 * 
 */
public class PropertiesTest2 {
	public static void main(String[] args) throws IOException, IOException {
		
		//����properties��
		Properties prop= new Properties();
		//�����ļ���������
		prop.load(new FileReader("count.txt"));
		//ȡ�����е�����
		String value=prop.getProperty("count");
		int number=Integer.parseInt(value);
		if(number>=5) {
			System.out.println("��ʹ��5��,�븶��");
			System.exit(0);
		}else {
			number++;
			prop.setProperty("count", String.valueOf(number));
			prop.store(new FileWriter("count.txt"), null);
			GuessNumber.start();
		}
		
		
		
		
	}
}
