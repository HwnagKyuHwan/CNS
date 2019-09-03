package com.kh.view;

import java.awt.Container;

import javax.swing.JPanel;

import com.kh.view.MainFrame;

public class ChangePanel {
	

	
	public static void changePanel(MainFrame mf,  JPanel op, JPanel np ) {
		
		
		
		 mf.remove(op);
		
		
		 mf.setContentPane(np);
		 mf.repaint();
	}
	
	


	
	
	
	
	

}
