package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		//��ΪMap���ϵ�ʹ��
		Properties prop = new Properties();
		
		//���Ԫ��
		prop.put("it002", "hello");
		prop.put("it001", "world");
		prop.put("it003", "java");
		
		//��������
		Set<Object> set = prop.keySet();
		for(Object key:set) {
			Object value =prop.get(key);
			System.out.println(key+"---"+value);
		}
		//System.out.println("prop:"+prop);
	}
}
