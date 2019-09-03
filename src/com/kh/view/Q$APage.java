package com.kh.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Q$APage extends JPanel{

	private MainFrame mf;
	private JPanel Q$APAge;
	
	
	
	public Q$APage(MainFrame mf) {
		
		this.mf = mf;
		Q$APAge = this;
		
		this.setBounds(0, 100, 1150, 600);
		this.setLayout(null);
		
		
		JLabel jl = new JLabel("Q&A ∆‰¿Ã¡ˆ");
		jl.setBounds(0, 0, 100, 100);
		this.add(jl);
		
	}
}
