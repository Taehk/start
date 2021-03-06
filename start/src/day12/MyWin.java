package day12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyWin {
	JFrame fr;
	JPanel mainP, bPan;
	JButton btn1, btn2;
	
	public MyWin() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainP = new JPanel();
		mainP.setPreferredSize(new Dimension(280, 450));
		mainP.setBackground(Color.GREEN);
		
		
		bPan = new JPanel();
		bPan.setLayout(new GridLayout(1,2));
		
		btn1 = new JButton("닫기");
		btn2 = new JButton("변경");
		
		ActionListener act = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	// 이게 무명 내부클래스
				System.exit(0);		// 오버라이드하는 함수의 내용이 극도로 짧아져 별도로 클래스를 구현하는 것이 번거롭다
			}						// 구현하는 순간 new 시킨 인스턴스를 사용
		};
		
		ActionListener act1 = new MyEvt();
		
		btn1.addActionListener(act);
		btn2.addActionListener(act1);
		
		bPan.add(btn1);
		bPan.add(btn2);
		
		fr.add(mainP, BorderLayout.CENTER);
		fr.add(bPan, BorderLayout.SOUTH);
		
		
		fr.setVisible(true);
		fr.setSize(300, 500);
		fr.setResizable(false);
	}
	
	public static void main(String[] args) {
		new MyWin();
	}


	class MyEvt implements ActionListener{
			// 전역 내부 클래스
		@Override
		public void actionPerformed(ActionEvent e) {
			int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			
			Color c = new Color(red, green, blue);
			
			mainP.setBackground(c);
		}
	}
}