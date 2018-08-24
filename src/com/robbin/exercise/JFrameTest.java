package com.robbin.exercise;
import javax.swing.*;


public class JFrameTest extends JFrame{
	
	JButton jb1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrameTest jft = new JFrameTest();

	}
	
	public JFrameTest () 
	{
		jb1 = new JButton ("confirm");
		
		this.add(jb1);
		this.setTitle("hello world");
		this.setSize(500, 500);
		this.setLocation(500, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
