package cn.itcast_08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * 我有一个文本文件(user.txt),我知道数据是键值对形式的,但是不知道内容是什么
 * 请写一个程序判断是否有"lisi"这样的键存在,有的话就改变为100
 * 
 * 	分析:
 * 		A:把文件中的数据先加载到集合中
 * 		B:遍历集合,得一每一个键
 * 		C:判断 键 是否有为"lisi"的,如果有就修改为100
 * 		D:把集合中的数据重新存储到文件中
 */

public class PropertiesTest {
	public static void main(String[] args) throws IOException, IOException {
		//A:把文件中的数据先加载到集合中
		Properties prop = new Properties();
		prop.load(new FileReader("user.txt"));
		//B:遍历集合,得一每一个键
		Set<String> set = prop.stringPropertyNames();
		for(String key:set) {
			if(key.equals("lisi")) {
				prop.setProperty(key,"90");
			}
		}
		prop.store(new FileWriter("user.txt"), null);
	}

}
