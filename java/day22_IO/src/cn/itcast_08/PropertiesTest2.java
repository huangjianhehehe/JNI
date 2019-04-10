package cn.itcast_08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * 我有一个小程序,测试类中只能运行5次,超过5次游戏结束,请付费
 * 
 */
public class PropertiesTest2 {
	public static void main(String[] args) throws IOException, IOException {
		
		//利用properties做
		Properties prop= new Properties();
		//加载文件到集合中
		prop.load(new FileReader("count.txt"));
		//取集合中的数据
		String value=prop.getProperty("count");
		int number=Integer.parseInt(value);
		if(number>=5) {
			System.out.println("已使用5次,请付费");
			System.exit(0);
		}else {
			number++;
			prop.setProperty("count", String.valueOf(number));
			prop.store(new FileWriter("count.txt"), null);
			GuessNumber.start();
		}
		
		
		
		
	}
}
