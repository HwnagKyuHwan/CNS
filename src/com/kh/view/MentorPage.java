package com.kh.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MentorPage extends JPanel{      //������������ ��ӹ޾ƾ��ϳ� , JPanel�� ��ӹ޾ƾ��ϳ�
	private MainFrame mf;
	private JPanel MentorPage;
	
	
	
	public MentorPage(MainFrame mf) {
		
		this.mf = mf;
		MentorPage = this;
		
		
		this.setBounds(0, 100, 1150, 600); // m&m ��� ��ġ�� ũ��
		this.setLayout(null);
		
		
		JLabel jl = new JLabel("����������");
		jl.setBounds(0, 0, 100, 100);
		this.add(jl);
		
	}
	
	
	
	
	
	

}
