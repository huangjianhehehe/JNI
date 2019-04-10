package cn.itcast_06;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class FrameDemo {
	public static void main(String[] args) {
		//�����������
		Frame f = new Frame();
		//���ô������ 
	f.setTitle("�༶�˵�");
	f.setBounds(400, 300, 400, 400);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
	//�����˵���
	MenuBar mb =new MenuBar();
	//�����˵�
	Menu m1 = new Menu("�ļ�");
	Menu m2 = new Menu("����ϵͳ");
	//�����˵���
	MenuItem mi1 = new MenuItem("�ú�ѧϰ");
	MenuItem mi2 = new MenuItem("��������");
	MenuItem mi3 = new MenuItem("�򿪼��±�");
	MenuItem mi4 = new MenuItem("�˳�ϵͳ");
	
	m2.add(mi1);
	m2.add(mi2);
	m1.add(m2);
	m1.add(mi3);
	m1.add(mi4);
	
	mb.add(m1);
	
	f.setMenuBar(mb);
	mi3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Runtime r = Runtime.getRuntime();
			try {
				r.exec("notepad");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	});
	}
}
