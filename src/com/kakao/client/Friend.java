package com.kakao.client;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class Friend extends JPanel{
	Canvas can;
	ImageIcon icon;
	JPanel p_container;
	
	
	JLabel la_img; //프로필 이미지
	JLabel la_name; //나의 이름
	JLabel la_status;//나의 상태 메세지
	JLabel la_badge;//메세지 수신 표시 뱃지
	String name;
	String status;
	int badge;
	
	public Friend(String path, String name, String status) {
		this.setLayout(new BorderLayout());
		this.name=name;
		this.status=status;
		p_container = new JPanel();
		p_container.setLayout(new GridLayout(2,1));
		
		
		icon=new ImageIcon(path);
		icon=new ImageIcon(icon.getImage().getScaledInstance(75, 50, Image.SCALE_SMOOTH));
		la_img = new JLabel(icon);
		la_name = new JLabel(name);
		la_status = new JLabel(status);
		la_badge = new JLabel("");
		
		Border border=la_name.getBorder();
		Border margin = new EmptyBorder(10, 10, 10, 0);//적용할 마진 생성한다
		la_name.setBorder(new CompoundBorder(border, margin));//적용타겟에 생성한 마진을 적용한다
		la_status.setBorder(new CompoundBorder(border, margin));//적용타겟에 생성한 마진을 적용한다;
		
		la_img.setPreferredSize(new Dimension(75, 50));
		la_badge.setPreferredSize(new Dimension(30, 50));
		la_badge.setForeground(Color.RED);
		la_badge.setFont(new Font("돋움",Font.BOLD,20));
		
		add(la_img, BorderLayout.WEST);
		p_container.add(la_name);
		p_container.add(la_status);
		add(p_container);
		add(la_badge, BorderLayout.EAST);
		
		this.setBackground(Color.WHITE);
		p_container.setBackground(Color.WHITE);
		setPreferredSize( new Dimension(400, 55));		
		
		
		//현재 패널과 리스너 연결 
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("눌럿음?");
				new ChatClient(la_img, la_name);
			}
		});		
		
		setBadNum();
	}
	
	/*-------------------------------------------------------
  	 누군가 말을 건네오면 뱃지 숫자를 증가시킨다
	-------------------------------------------------------*/
	public void setBadNum() {
		badge++;
		la_badge.setText(Integer.toString(badge));
	}
	
}











