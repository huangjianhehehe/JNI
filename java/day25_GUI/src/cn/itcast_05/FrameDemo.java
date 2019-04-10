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
		//创建窗体对象
		Frame f = new Frame("数据转移");
		//设置窗体属性和布局
		f.setBounds(400,200,400,300);
		f.setLayout(new FlowLayout());
		
		//创建文本框
		TextField tf = new TextField(20);
		//创建按钮
		Button bu = new Button("数据转移");
		//创建文本域
		TextArea ta = new TextArea(10,40);
		
		//把组件添加到窗体
		f.add(tf);
		f.add(bu);
		f.add(ta);
		//添加关闭
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		//让直接回车也可以转移数据
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
					// 获取文本框的值 
					String tf_str=tf.getText().trim();
					//清空数据
					tf.setText("");
					ta.append(tf_str+"\r\n");
					tf.requestFocus();
				}
				
			}
		});
		
		//添加按钮点击事件
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取文本框的值 
				String tf_str=tf.getText().trim();
				//清空数据
				tf.setText("");
				ta.append(tf_str+"\r\n");
				tf.requestFocus();
				
			}
		});
		f.setVisible(true);
	}
}
