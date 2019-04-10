package cn.itcast_08;

import java.util.Scanner;

public class GuessNumber {
	private GuessNumber() {
		
	}
	public static void start() {
		//产生一个随机数
		int number=(int)(Math.random()*100)+1;
		int count=1;    //50,9,90,80,70,75,72,73,74
		while(true) {
			//键入一个数据
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个数(1-100):");
			int guessNumber=sc.nextInt();
			
			//判断 
			if(guessNumber>number) {
				System.out.println("你猜的数据"+guessNumber+"大了");
				count++;
			}else if(guessNumber<number) {
				System.out.println("你猜的数据"+guessNumber+"小了");
				count++;
			}else {
				System.out.println("恭喜你,"+count+"次就猜对了");
				break;
			}
		}
	}

}
