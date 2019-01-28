package com.kakao.client;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame{
	JPanel p_north;
	JLabel la_img;
	JLabel la_name;
	JTextArea area;
	JScrollPane scroll;
	JTextField t_input;
	
	String ip="localhost";
	int port=9999;
	
	public ChatClient(JLabel la_img, JLabel la_name) {
		this.la_img=la_img;
		this.la_name=la_name;
		
		p_north=new JPanel();
		p_north.setLayout(new BorderLayout());
		la_name.setBackground(Color.WHITE);
		
		area= new JTextArea();
		scroll  =new JScrollPane(area);
		t_input=new JTextField();
		
		p_north.add(la_img, BorderLayout.WEST);
		p_north.add(la_name);
		
		add(p_north, BorderLayout.NORTH);
		add(scroll);
		
		add(t_input, BorderLayout.SOUTH);
		setSize(400,450);
		setVisible(true);
	}	
}
