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

		//		load() 加载文件中的数据
		//		Reader r=new FileReader("prop.txt");
		//		prop.load(r);
		//		r.close();
		//		System.out.println(prop);
		
		//store() 把集合中的数据存储到文件中
		//添加元素
		prop.setProperty("张三", "30");
		prop.setProperty("李四", "39");
		prop.setProperty("赵六", "41");
		
		prop.store(new FileWriter("name.txt"), null);

		}
	}

