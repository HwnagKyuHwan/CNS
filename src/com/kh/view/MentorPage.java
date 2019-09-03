package com.kh.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MentorPage extends JPanel{      //메인페이지를 상속받아야하나 , JPanel을 상속받아야하나
	private MainFrame mf;
	private JPanel MentorPage;
	
	
	
	public MentorPage(MainFrame mf) {
		
		this.mf = mf;
		MentorPage = this;
		
		
		this.setBounds(0, 100, 1150, 600); // m&m 페널 위치와 크기
		this.setLayout(null);
		
		
		JLabel jl = new JLabel("멘토페이지");
		jl.setBounds(0, 0, 100, 100);
		this.add(jl);
		
	}
	
	
	
	
	
	

}
