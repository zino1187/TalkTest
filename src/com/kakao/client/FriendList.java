package com.kakao.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FriendList extends JPanel{
	ClientMain clientMain;
	String path="E:/workspace/spring_workspace/KakaoTalk/data/";
	
	public FriendList(ClientMain clientMain) {
		this.clientMain=clientMain;
		setBackground(new Color(255,235,51));
		setPreferredSize( new Dimension(400, 450));
		setVisible(false);
		getList();
	}
	
	//친구 목록 가져오기
	public void getList() {
		String filename=path+"Penguins.jpg";
		String name="대갈공명";
		String status="내가 답이다";
		for(int i=0;i<20;i++) {
			Friend friend = new Friend(filename, name, status);
			add(friend);
		}		
	}
}
