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

		this.setLayout(null); // 메인페이지 판넬 널 레이아웃으로 설정

		
		
		this.setBounds(0, 0, 1150, 700); // 탑판넬 위치와 크기

		JButton m$mbutton = new JButton("M & M"); // 탑판넬에 버튼4개
		m$mbutton.setBounds(10, 0, 150, 70);
		this.add(m$mbutton);

		m$mbutton.addActionListener(new m$mEvent()); // M&M 버튼 누르면 이벤트!!!!!!!!!!!!!!!!

		JButton Q$Abutton = new JButton("Q & A");
		Q$Abutton.setBounds(160, 0, 150, 70);
		this.add(Q$Abutton);

		Q$Abutton.addActionListener(new Q$AbuttonEvent()); // Q&A 버튼 누르면 이벤트!!!!!!!!!!!!!!!!

		JButton Studybutton = new JButton("study");
		Studybutton.setBounds(320, 0, 150, 70);
		this.add(Studybutton);

		Studybutton.addActionListener(new StudybuttonEvent()); // 스터디 / 프로젝트 버튼 누르면 이벤트!!!!!!!!!!!!!

		JButton myPage = new JButton("myPage");
		myPage.setBounds(480, 0, 150, 70);
		this.add(myPage);

		myPage.addActionListener(new myPageEvent()); // mypage 누르면 이벤트!!!!!!!!!!!!!!!!!!!!!!

		

		id = new JTextField(); // mentor/ mentee 입력하는창 -> 멘토입력하면 멘토페이지, 멘티입력하면 멘티페이지
		id.setBounds(100, 200, 100, 100); // 나중에는 파일 입출력을 통해 자동으로 할수있게
		this.add(id);

		
		

		mf.setContentPane(this);

	}

	class m$mEvent implements ActionListener { // m&m 버튼 이벤트!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

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

	class myPageEvent implements ActionListener { // m&m 버튼 이벤트!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

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

	class StudybuttonEvent implements ActionListener { // Q&A 버튼 이벤트!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		@Override
		public void actionPerformed(ActionEvent e) {

			//ChangePanel.changePanel(mf, subPanel, new StudyPage());
			
			

			ChangePanel.changePanel(mf, MainPage, new StudyPage(mf));
			
		}

	}

	class Q$AbuttonEvent implements ActionListener { // Q&A 버튼 이벤트!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		
		
		@Override
		public void actionPerformed(ActionEvent e) {
		

			ChangePanel.changePanel(mf, MainPage , new Q$APage(mf));

		}

	}
	

	
	

}
