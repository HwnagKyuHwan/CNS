package com.kh.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MentorMyPage extends JPanel{
	
	private MainFrame mf;
	private JPanel MentorMyPage;
	
	public MentorMyPage(MainFrame mf) {
		
		this.mf = mf;
		MentorMyPage = this;
		
		this.setBounds(0, 100, 1150, 600); // ���丶�������� ��� ��ġ�� ũ��
		this.setLayout(null);
		
		
		JLabel jl = new JLabel("���� ����������");
		jl.setBounds(0, 0, 100, 100);
		this.add(jl);
		
		
	}

}
