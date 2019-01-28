package com.kakao.client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class LoginForm extends JPanel{
	ClientMain clientMain;
	JTextField t_id;
	JTextField t_password;
	JButton bt_login;
	
	
	public LoginForm(ClientMain clientMain) {
		this.clientMain=clientMain;
		t_id = new JTextField();
		t_password = new JTextField();
		bt_login = new JButton("로그인");
		
		t_id.setPreferredSize(new Dimension(380, 25));
		t_password.setPreferredSize(new Dimension(380, 25));
		
		add(t_id);
		add(t_password);
		add(bt_login);
		
		bt_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientMain.showPage(1);
			}
		});
		
		setBackground(new Color(255,235,51));
		setPreferredSize( new Dimension(400, 450));				
	}
	
}
