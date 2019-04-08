package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		//作为Map集合的使用
		Properties prop = new Properties();
		
		//添加元素
		prop.put("it002", "hello");
		prop.put("it001", "world");
		prop.put("it003", "java");
		
		//遍历集合
		Set<Object> set = prop.keySet();
		for(Object key:set) {
			Object value =prop.get(key);
			System.out.println(key+"---"+value);
		}
		//System.out.println("prop:"+prop);
	}
}
