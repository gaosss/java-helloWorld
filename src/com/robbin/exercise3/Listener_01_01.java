package com.robbin.exercise3;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Listener_01_01 extends JFrame implements ActionListener {
	
	static JPanel jp = null;
	public JPanel getJp() {
		return jp;
	}

	public void setJp(JPanel jp) {
		this.jp = jp;
	}

	JButton jb1, jb2;
	CatListen cat = new CatListen();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listener_01_01 listen = new Listener_01_01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("gre")) 
		{
			System.out.println("you select green");
			//jp.setBackground(Color.GREEN);
		}else if (e.getActionCommand().equals("rrr")) 
		{
			System.out.println("you select red");
			//jp.setBackground(Color.red);
		}
	}
	
	Listener_01_01()
	{
		jp = new JPanel();
		jb1 = new JButton("green");
		jb1.setName("gre");
		jb2 = new JButton("red");
		jp.setBackground(Color.BLACK);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		jb1.addActionListener(cat);
		jb2.addActionListener(cat);
		
		
		jb1.setActionCommand(jb1.getName());
		jb2.setActionCommand("rrr");
		
		this.add(jp, BorderLayout.CENTER);
		this.add(jb1, BorderLayout.NORTH);
		this.add(jb2, BorderLayout.SOUTH);
		
		//System.out.println(jb1.getName());
		
		this.setTitle("Listener");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public  static void changecolor(Color color) 
	{
		jp.setBackground(color);
	}

}


class CatListen implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("gre")) 
		{
			System.out.println("cat select green");
			Listener_01_01.changecolor(Color.GREEN);
			//Listener_01_01.
			//p.setBackground(Color.GREEN);
		}else if (e.getActionCommand().equals("rrr")) 
		{
			System.out.println("cat select red");
			Listener_01_01.changecolor(Color.RED);
		}
	}
	

}
