package com.kh.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudyPage extends JPanel{
	
	private MainFrame mf;
	private JPanel StudyPage;
	
	public StudyPage(MainFrame mf) {
		
		this.mf = mf;
		StudyPage = this;
		
		this.setBounds(0, 100, 1150, 600);
		this.setLayout(null);
		
		
		JLabel jl = new JLabel("스터디/프로젝트 페이지");
		jl.setBounds(0, 0, 100, 100);
		this.add(jl);
		
	}
	

}
