package com.kh.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MentorMyPage extends JPanel{
	
	private MainFrame mf;
	private JPanel MentorMyPage;
	
	public MentorMyPage(MainFrame mf) {
		
		this.mf = mf;
		MentorMyPage = this;
		
		this.setBounds(0, 100, 1150, 600); // 멘토마이페이지 페널 위치와 크기
		this.setLayout(null);
		
		
		JLabel jl = new JLabel("멘토 마이페이지");
		jl.setBounds(0, 0, 100, 100);
		this.add(jl);
		
		
	}

}
