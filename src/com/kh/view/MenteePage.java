package com.kh.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MenteePage extends JPanel{
	
	private MainFrame mf;
	private JPanel MenteePage;
	
	public MenteePage(MainFrame mf) {
		
		this.mf = mf;
		MenteePage = this;
		
		this.setBounds(0, 100, 1150, 600); // m&m ��� ��ġ�� ũ��
		this.setLayout(null);
		
		
		JLabel jl = new JLabel("��Ƽ������");
		jl.setBounds(0, 0, 100, 100);
		
		this.add(jl);
		
		
		

		
		
		
		
		
		
	}

}
