package com.kh.view;



import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame{
	
	public MainFrame() {
		
		this.setTitle("�̴�������Ʈ"); //���� ������ Ÿ��Ʋ
		this.setResizable(false); // ������ ������ ���ٲٰ�
		this.setSize(1150, 700); // ������ ������
		
		this.setLayout(null); // ������ �η��̾ƿ����� ����(x��ǥ, y��ǥ�� ��ġ)
		
	
		
		new LoginPage(this);
		
		
		
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
