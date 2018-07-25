package model;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SnakeFrame  extends Frame{

	public static void main(String[] args) {
		
		SnakeFrame s = new SnakeFrame();
		s.launchFrame();

	}

	private void launchFrame() {
		
		this.setLocation(300, 400);
		this.setSize(400, 400);
		this.setBackground(Color.WHITE);
		this.setTitle("Snake");
		//��ӹرյĴ����¼�
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		//��ֹ�ı䴰�Ĵ�С
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
