package com.kakao.client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ClientMain extends JFrame{
	
	LoginForm loginForm;
	ChatMain friendList;
	JPanel[] pages=new JPanel[2];
	JScrollPane scroll; 
	String path="E:/workspace/spring_workspace/KakaoTalk/data/";
	
	public ClientMain() {
		pages[0]= new LoginForm(this);
		pages[1]= new ChatMain(this);
		
		setLayout(new FlowLayout());
		
		scroll=new JScrollPane();
		pages[1].add(scroll);
		
		add(pages[0]);
		add(pages[1]);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showPage(int page) {
		for(int i=0;i<pages.length;i++) {
			if(page == i) {
				pages[i].setVisible(true);
			}else {
				pages[i].setVisible(false);
			}
		}
	}
	
	public static void main(String[] args) {
		new ClientMain();
	}
}
