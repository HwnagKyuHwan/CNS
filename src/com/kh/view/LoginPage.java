package com.kh.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JPanel {

	private MainFrame mf;
	private JPanel LoginPage;
	private JPanel SignupPage;

	private JTextField idTextField;
	private JPasswordField pwField;
	
	public LoginPage() {}

	public LoginPage(MainFrame mf) { // 프레임위에 로그인판넬
							// this 가 로그인판넬!!
		this.mf = mf;
		LoginPage = this;

		this.setBounds(0, 0, 1150, 700);
		this.setLayout(null);

		JPanel logoPanel = new JPanel();

		logoPanel.setBounds(0, 0, 1150, 300);
		logoPanel.setLayout(null);
	
		this.add(logoPanel);

		Image logo = new ImageIcon("image/logo.png").getImage().getScaledInstance(200, 200, 0);
		JLabel label = new JLabel(new ImageIcon(logo));
		label.setBounds(430, 100, 200, 200);
		logoPanel.add(label);

		// 아이디 라벨
		JLabel idLabel = new JLabel("아이디 ");
		idLabel.setBounds(327, 359, 67, 18);
		this.add(idLabel);

		// 패스워드 라벨
		JLabel pwLabel = new JLabel("비밀번호 ");
		pwLabel.setBounds(317, 400, 77, 18);
		this.add(pwLabel);

		// 아이디 입력 텍스트창
		idTextField = new JTextField();
		idTextField.setBounds(395, 356, 234, 24);
		this.add(idTextField);
		idTextField.setColumns(10);

		// 비밀번호 입력 텍스트창
		pwField = new JPasswordField();
		pwField.setBounds(395, 397, 234, 24);
		this.add(pwField);

		// 로그인 버튼
		JButton signInButton = new JButton("Sign In");
		signInButton.setBounds(643, 355, 105, 63);
		this.add(signInButton);

		// 회원가입 버튼
		JButton signUpButton = new JButton("Sign Up");
		signUpButton.setBounds(971, 532, 105, 27);
		this.add(signUpButton);

		signUpButton.addActionListener(new signUpEvent());
		signInButton.addActionListener(new signInEvent());

		setVisible(true);
		mf.setContentPane(this);

	}

	private class signUpEvent implements ActionListener {
		
		
	
		
		
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
		
	
		
			ChangePanel.changePanel(mf, LoginPage, new SignupPage(mf));
			

		}

	}
private class signInEvent implements ActionListener {
		
		
	
		
		
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
		
	
		
			ChangePanel.changePanel(mf, LoginPage, new MainPage(mf));
			

		}

	}

}
