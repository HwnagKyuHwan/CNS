package com.kh.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.kh.controller.UserManager;
import com.kh.model.dao.MenteeDao;
import com.kh.model.dao.MentorDao;
import com.kh.model.vo.Mentee;
import com.kh.model.vo.Mentor;
import java.util.ArrayList;

public class SignupPage extends JPanel {

	private MainFrame mf;
	private JPanel SignupPage;
	private JPanel LoginPage;
	private UserManager um;

	private MenteeDao menteeDao;
	private MentorDao mentorDao;

	private JTextField idField;
	private JPasswordField pwField;
	private JPasswordField pwField2;
	private JTextField nameField;
	private JTextField emailField;

	private JRadioButton mentor;
	private JRadioButton mentee;

	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;

	JLabel lblNewLabel_3;
	JLabel lblNewLabel_4;
	JLabel lblNewLabel_5;

	private JButton SignupOk;
	
	private String strMentorPwCheck;
	private String strMentorPw;
	
	private String strMenteePwCheck;
	private String strMenteePw;
	
	private Mentee mmentee;
	private Mentor mmentor;

	public SignupPage(MainFrame mf) {
		this.mf = mf;
		SignupPage = this;
		this.mmentee=new Mentee();
		this.mmentor=new Mentor();

		this.setBounds(0, 0, 1150, 700);
		this.setLayout(null);

		JLabel welcome = new JLabel("Welcome to CNS");
		welcome.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 35));
		welcome.setBounds(156, 113, 276, 41);
		add(welcome);

		JLabel idLabel = new JLabel("아이디");
		idLabel.setBounds(131, 184, 62, 18);
		add(idLabel);

		JLabel pwLabel = new JLabel("비밀번호");
		pwLabel.setBounds(114, 227, 62, 18);
		add(pwLabel);

		JLabel pwLabel2 = new JLabel("비밀번호 확인");
		pwLabel2.setBounds(81, 268, 89, 18);
		add(pwLabel2);

		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(141, 314, 62, 18);
		add(nameLabel);

		JLabel emailLabel = new JLabel("이메일");
		emailLabel.setBounds(131, 353, 62, 18);
		add(emailLabel);

		idField = new JTextField();
		idField.setBounds(199, 181, 233, 24);
		add(idField);
		idField.setColumns(10);

		pwField = new JPasswordField();
		pwField.setColumns(10);
		pwField.setBounds(199, 224, 233, 24);
		add(pwField);

		pwField2 = new JPasswordField();
		pwField2.setColumns(10);
		pwField2.setBounds(199, 265, 233, 24);
		add(pwField2);

		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(199, 311, 233, 24);
		add(nameField);

		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(199, 350, 233, 24);
		add(emailField);

		mentor = new JRadioButton("멘토로 가입하겠습니다");
		mentor.setBounds(99, 395, 206, 27);
		add(mentor);

		mentee = new JRadioButton("멘티로 가입하겠습니다");
		mentee.setBounds(311, 395, 186, 27);
		add(mentee);

		ButtonGroup RadioGroup = new ButtonGroup();
		RadioGroup.add(mentor);
		RadioGroup.add(mentee);

		lblNewLabel = new JLabel("멘토 라벨1");
		lblNewLabel.setBounds(622, 93, 62, 18);
		add(lblNewLabel);

		lblNewLabel_1 = new JLabel("멘토 라벨2");
		lblNewLabel_1.setBounds(622, 240, 62, 18);
		add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("멘토 라벨3");
		lblNewLabel_2.setBounds(622, 399, 62, 18);
		add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("멘티 라벨1");
		lblNewLabel_3.setBounds(622, 93, 62, 18);
		add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("멘티 라벨2");
		lblNewLabel_4.setBounds(622, 240, 62, 18);
		add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("멘티 라벨3");
		lblNewLabel_5.setBounds(622, 399, 62, 18);
		add(lblNewLabel_5);

		mentor.addActionListener(new MyEvent2());
		mentee.addActionListener(new MyEvent2());

		lblNewLabel.setVisible(false);
		lblNewLabel_1.setVisible(false);
		lblNewLabel_2.setVisible(false);

		lblNewLabel_3.setVisible(false);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_5.setVisible(false);

		SignupOk = new JButton("OK");
		SignupOk.setBounds(622, 500, 100, 30);
		this.add(SignupOk);

		SignupOk.setVisible(false);

		SignupOk.addActionListener(new MyEvent1());

		setVisible(true);

	}

	public  Mentee  inputMentee() {

		Mentee mentee = new Mentee();

		String menteeid = idField.getText();
		mentee.setId(menteeid);

		char[] menteepw = pwField.getPassword();
		
		
		
		for(int i = 0; i < menteepw.length; i++) {
			strMenteePw = String.valueOf(menteepw[i]);
		}
		mentee.setPw(strMenteePw);
		
	

		char[] menteepwCheck = pwField2.getPassword();
		for(int i = 0; i < menteepw.length; i++) {
			strMenteePwCheck = String.valueOf(menteepwCheck[i]);
		}
		
		mentee.setPwCheck(strMenteePwCheck);

		String Name = nameField.getText();
		mentee.setName(Name);

		String Email = emailField.getText();
		mentee.setEmail(Email);

		mentee.setMentor_or_Mentee("Mentee");

		mentee.setJob(null);
		mentee.setField_Mentee(null); //////////////////// UI 추가하면 도전

		
		
		
		
		return mentee;
		
		
	}

	public Mentor inputMentor() {

		Mentor mentor = new Mentor();

		String mentorid = idField.getText();
		mentor.setId(mentorid);

		char[] mentorpw = pwField.getPassword();
		
		
		
		for(int i = 0; i < mentorpw.length; i++) {
			strMentorPw = String.valueOf(mentorpw[i]);
		}
		mentor.setPw(strMentorPw);
		
		

		char[] mentorpwCheck = pwField2.getPassword();
		for(int i = 0; i < mentorpw.length; i++) {
			strMentorPwCheck = String.valueOf(mentorpwCheck[i]);
		}
		
		mentor.setPwCheck(strMentorPwCheck);

		String Name = nameField.getText();
		mentor.setName(Name);

		String Email = emailField.getText();
		mentor.setEmail(Email);

		mentor.setMentor_or_Mentee("Mentor");

		mentor.setSchoolName(null);/////////////////////////////
		mentor.setCompanyName(null);

		mentor.setWorkingYear(0);
		mentor.setField_Mentoring(null);

		return mentor;
	}

	class MyEvent1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (mentee.isSelected()) {
				
				
				
				um.insertMentee(inputMentee());
				
				
				ChangePanel.changePanel(mf, SignupPage, new LoginPage(mf));
				

			} else if (mentor.isSelected()) {

				
				ChangePanel.changePanel(mf, SignupPage, new LoginPage(mf));
				um.insertMentor(inputMentor());
			}

			
		}

	}

	class MyEvent2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (mentee.isSelected()) {

				lblNewLabel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);

				lblNewLabel_3.setVisible(true);
				lblNewLabel_4.setVisible(true);
				lblNewLabel_5.setVisible(true);

				SignupOk.setVisible(true);

				System.out.println("멘티!!!!!!!!!!!!!!!!!!");

			} else if (mentor.isSelected()) {

				lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_5.setVisible(false);

				lblNewLabel.setVisible(true);
				lblNewLabel_1.setVisible(true);
				lblNewLabel_2.setVisible(true);

				SignupOk.setVisible(true);

				System.out.println("멘토!!!!!!!!!!!!!!!!!!!!!");
			}

		}

	}



}
