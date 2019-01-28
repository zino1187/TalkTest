package com.kakao.client;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class ChatList extends JPanel{
	ChatMain chatMain;
	String path;
	public ChatList(ChatMain chatMain) {
		this.chatMain=chatMain;
		this.path=chatMain.path;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(400,400));

		getList();
	}
	
	//친구 목록 가져오기
	public void getList() {
		String filename=path+"person.png";
		String name="대갈공명";
		String status="내가 답이다";
		for(int i=0;i<5;i++) {
			Friend friend = new Friend(filename, name, status);
			add(friend);
		}		
	}	
}
