package cn.itcast_08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * ����һ���ı��ļ�(user.txt),��֪�������Ǽ�ֵ����ʽ��,���ǲ�֪��������ʲô
 * ��дһ�������ж��Ƿ���"lisi"�����ļ�����,�еĻ��͸ı�Ϊ100
 * 
 * 	����:
 * 		A:���ļ��е������ȼ��ص�������
 * 		B:��������,��һÿһ����
 * 		C:�ж� �� �Ƿ���Ϊ"lisi"��,����о��޸�Ϊ100
 * 		D:�Ѽ����е��������´洢���ļ���
 */

public class PropertiesTest {
	public static void main(String[] args) throws IOException, IOException {
		//A:���ļ��е������ȼ��ص�������
		Properties prop = new Properties();
		prop.load(new FileReader("user.txt"));
		//B:��������,��һÿһ����
		Set<String> set = prop.stringPropertyNames();
		for(String key:set) {
			if(key.equals("lisi")) {
				prop.setProperty(key,"90");
			}
		}
		prop.store(new FileWriter("user.txt"), null);
	}

}
