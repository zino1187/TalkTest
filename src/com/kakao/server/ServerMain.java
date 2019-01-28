package com.kakao.server;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerMain extends JFrame{
	JPanel p_north;
	JTextField t_port;
	JButton bt_run;
	JTextArea area;
	JScrollPane scroll;
	
	int port=9999;
	
	public ServerMain() {
		p_north = new JPanel();
		t_port = new JTextField(Integer.toString(port),7);
		bt_run = new JButton("서버가동");
		area= new JTextArea();
		scroll  =new JScrollPane(area);
		
		p_north.add(t_port);
		p_north.add(bt_run);
		
		add(p_north, BorderLayout.NORTH);
		add(scroll);
		
		setVisible(true);
		setSize(400,450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ServerMain();
	}
}
