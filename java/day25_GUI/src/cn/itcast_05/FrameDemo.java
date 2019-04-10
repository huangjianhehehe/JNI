package cn.itcast_05;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		//�����������
		Frame f = new Frame("����ת��");
		//���ô������ԺͲ���
		f.setBounds(400,200,400,300);
		f.setLayout(new FlowLayout());
		
		//�����ı���
		TextField tf = new TextField(20);
		//������ť
		Button bu = new Button("����ת��");
		//�����ı���
		TextArea ta = new TextArea(10,40);
		
		//�������ӵ�����
		f.add(tf);
		f.add(bu);
		f.add(ta);
		//��ӹر�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		//��ֱ�ӻس�Ҳ����ת������
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					// ��ȡ�ı����ֵ 
					String tf_str=tf.getText().trim();
					//�������
					tf.setText("");
					ta.append(tf_str+"\r\n");
					tf.requestFocus();
				}
				
			}
		});
		
		//��Ӱ�ť����¼�
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ȡ�ı����ֵ 
				String tf_str=tf.getText().trim();
				//�������
				tf.setText("");
				ta.append(tf_str+"\r\n");
				tf.requestFocus();
				
			}
		});
		f.setVisible(true);
	}
}
