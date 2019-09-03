package com.kh.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPage extends JPanel {

	private MainFrame mf;
	private JPanel MainPage;



	private JTextField id;

	public MainPage() {

	}

	public MainPage(MainFrame mf) {
		this.mf = mf;
		MainPage = this;

		this.setLayout(null); // ���������� �ǳ� �� ���̾ƿ����� ����

		
		
		this.setBounds(0, 0, 1150, 700); // ž�ǳ� ��ġ�� ũ��

		JButton m$mbutton = new JButton("M & M"); // ž�ǳڿ� ��ư4��
		m$mbutton.setBounds(10, 0, 150, 70);
		this.add(m$mbutton);

		m$mbutton.addActionListener(new m$mEvent()); // M&M ��ư ������ �̺�Ʈ!!!!!!!!!!!!!!!!

		JButton Q$Abutton = new JButton("Q & A");
		Q$Abutton.setBounds(160, 0, 150, 70);
		this.add(Q$Abutton);

		Q$Abutton.addActionListener(new Q$AbuttonEvent()); // Q&A ��ư ������ �̺�Ʈ!!!!!!!!!!!!!!!!

		JButton Studybutton = new JButton("study");
		Studybutton.setBounds(320, 0, 150, 70);
		this.add(Studybutton);

		Studybutton.addActionListener(new StudybuttonEvent()); // ���͵� / ������Ʈ ��ư ������ �̺�Ʈ!!!!!!!!!!!!!

		JButton myPage = new JButton("myPage");
		myPage.setBounds(480, 0, 150, 70);
		this.add(myPage);

		myPage.addActionListener(new myPageEvent()); // mypage ������ �̺�Ʈ!!!!!!!!!!!!!!!!!!!!!!

		

		id = new JTextField(); // mentor/ mentee �Է��ϴ�â -> �����Է��ϸ� ����������, ��Ƽ�Է��ϸ� ��Ƽ������
		id.setBounds(100, 200, 100, 100); // ���߿��� ���� ������� ���� �ڵ����� �Ҽ��ְ�
		this.add(id);

		
		

		mf.setContentPane(this);

	}

	class m$mEvent implements ActionListener { // m&m ��ư �̺�Ʈ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		@Override
		public void actionPerformed(ActionEvent e) {

			String text = id.getText();

			if (text.equals("mentor")) {
				ChangePanel.changePanel(mf, MainPage, new MentorPage(mf));
			} else if (text.equals("mentee")) {
				ChangePanel.changePanel(mf, MainPage, new MenteePage(mf));
			}

		}

	}

	class myPageEvent implements ActionListener { // m&m ��ư �̺�Ʈ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		@Override
		public void actionPerformed(ActionEvent e) {

			String text = id.getText();

			if (text.equals("mentor")) {
				ChangePanel.changePanel(mf, MainPage, new MentorMyPage(mf));
			} else if (text.equals("mentee")) {
				ChangePanel.changePanel(mf, MainPage, new MenteeMyPage(mf));
			}

		}

	}

	class StudybuttonEvent implements ActionListener { // Q&A ��ư �̺�Ʈ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		@Override
		public void actionPerformed(ActionEvent e) {

			//ChangePanel.changePanel(mf, subPanel, new StudyPage());
			
			

			ChangePanel.changePanel(mf, MainPage, new StudyPage(mf));
			
		}

	}

	class Q$AbuttonEvent implements ActionListener { // Q&A ��ư �̺�Ʈ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		
		
		@Override
		public void actionPerformed(ActionEvent e) {
		

			ChangePanel.changePanel(mf, MainPage , new Q$APage(mf));

		}

	}
	

	
	

}
