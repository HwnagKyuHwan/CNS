package com.kh.view;



import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame{
	
	public MainFrame() {
		
		this.setTitle("미니프로젝트"); //메인 프레임 타이틀
		this.setResizable(false); // 프레임 사이즈 못바꾸게
		this.setSize(1150, 700); // 프레임 사이즈
		
		this.setLayout(null); // 프레임 널레이아웃으로 설정(x좌표, y좌표로 배치)
		
	
		
		new LoginPage(this);
		
		
		
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
