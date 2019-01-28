package com.kakao.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ChatMain extends JPanel{
	ClientMain clientMain;
	//this == Border
	JPanel p_south;//south
	JPanel[] pages=new JPanel[2];
	JLabel bt_friend;
	JLabel bt_chat;
	JScrollPane scroll;
	String path;
	
	public ChatMain(ClientMain clientMain) {
		this.clientMain=clientMain;
		this.path=clientMain.path;
		
		pages[0] = new FriendList(this);
		pages[1] = new ChatList(this);

		p_south=new JPanel();
		bt_friend=new JLabel(new ImageIcon(new ImageIcon(path+"member.png").getImage().getScaledInstance(40, 35, Image.SCALE_SMOOTH)));
		bt_chat=new JLabel(new ImageIcon(new ImageIcon(path+"chat.png").getImage().getScaledInstance(40, 35, Image.SCALE_SMOOTH)));
		
		
		bt_friend.setPreferredSize(new Dimension(100, 45));
		bt_chat.setPreferredSize(new Dimension(100, 45));
		
		p_south.setPreferredSize(new Dimension(400,45));
		p_south.add(bt_friend);
		p_south.add(bt_chat);
		
		add(pages[0]);
		add(pages[1]);
		
		add(p_south, BorderLayout.SOUTH);
		
		bt_friend.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				showPage(0);
			}
		});
		
		bt_chat.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				showPage(1);
			}
		});
		
		showPage(0);
		setPreferredSize( new Dimension(400, 450));
		setVisible(false);
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

}
