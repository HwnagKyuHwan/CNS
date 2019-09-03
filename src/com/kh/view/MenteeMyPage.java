package com.kh.view;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.kh.view.MainPage.Q$AbuttonEvent;

public class MenteeMyPage extends JPanel {

	private MainFrame mf;
	private JPanel MenteeMyPage;

	private JButton Mentoring;
	private JButton PersonalInformation;
	private JTable table;
	private JScrollPane scroll;
	private JButton ok;
	private Dialog sd;

	public MenteeMyPage(MainFrame mf) {

		this.mf = mf;
		MenteeMyPage = this;

		this.setBounds(0, 100, 1150, 600); // 멘티마이페이지 페널 위치와 크기
		this.setLayout(null);

		Mentoring = new JButton("신청 멘토링 목록");
		Mentoring.setBounds(70, 100, 150, 50);

		PersonalInformation = new JButton("개인정보수정");
		PersonalInformation.setBounds(70, 250, 150, 50);

		String[][] data = new String[10][4];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = null;
			}
		}

		String[] title = { "번호", "신청 멘토 이름", "세부 내용", "신청 현황" };

		table = new JTable(data, title);

		table.getColumnModel().getColumn(0).setMaxWidth(100); // 0번째 칼럼 속성셋팅
		table.getColumnModel().getColumn(0).setMinWidth(100);
		table.getColumnModel().getColumn(0).setWidth(100);

//		table.getColumnModel().getColumn(1).setMaxWidth(100);
//		table.getColumnModel().getColumn(1).setMinWidth(100);
//		table.getColumnModel().getColumn(1).setWidth(100);
//		
//		table.getColumnModel().getColumn(2).setMaxWidth(100);
//		table.getColumnModel().getColumn(2).setMinWidth(100);
//		table.getColumnModel().getColumn(2).setWidth(100);
//		
//		table.getColumnModel().getColumn(3).setMaxWidth(100);
//		table.getColumnModel().getColumn(3).setMinWidth(100);
//		table.getColumnModel().getColumn(3).setWidth(100);
//		
		table.setRowHeight(40); // 행의 높이 정하기

		table.setBounds(400, 100, 500, 400);
		this.add(table);

		table.setVisible(false);

		sd = new Dialog(mf, "비밀번호 확인");
		sd.setLayout(null);
		sd.setBounds(300, 150, 500, 300);

		JButton ok = new JButton("ok");
		ok.setBounds(225, 250, 100, 50);
		sd.add(ok);

		Mentoring.addActionListener(new Mentoring());
		PersonalInformation.addActionListener(new PersonalInformation());
		ok.addActionListener(new ok());

		this.add(Mentoring);
		this.add(PersonalInformation);

	}

	class Mentoring implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			table.setVisible(true);

		}

	}

	class PersonalInformation implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			table.setVisible(false);
			sd.setVisible(true);

		}

	}

	class ok implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			sd.setVisible(false);
			ChangePanel.changePanel(mf, MenteeMyPage, new SignupPage(mf));

		}

	}

}
