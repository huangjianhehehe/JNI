package cn.itcast_08;

import java.util.Scanner;

public class GuessNumber {
	private GuessNumber() {
		
	}
	public static void start() {
		//����һ�������
		int number=(int)(Math.random()*100)+1;
		int count=1;    //50,9,90,80,70,75,72,73,74
		while(true) {
			//����һ������
			Scanner sc = new Scanner(System.in);
			System.out.println("������һ����(1-100):");
			int guessNumber=sc.nextInt();
			
			//�ж� 
			if(guessNumber>number) {
				System.out.println("��µ�����"+guessNumber+"����");
				count++;
			}else if(guessNumber<number) {
				System.out.println("��µ�����"+guessNumber+"С��");
				count++;
			}else {
				System.out.println("��ϲ��,"+count+"�ξͲ¶���");
				break;
			}
		}
	}

}
