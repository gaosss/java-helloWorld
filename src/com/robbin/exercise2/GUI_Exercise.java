package com.robbin.exercise2;
import java.awt.*;
import javax.swing.*;
public class GUI_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jf = new JFrame();
		
		
		//JPasswordField
		JPasswordField jpf = new JPasswordField();
		jpf.setVisible(true);
		jpf.setBackground(Color.BLUE);
		jpf.setBounds(20, 10, 80, 20);
		jpf.setEchoChar('#');
		//jpf.set
	
		JLabel jl1 = new JLabel("请输入密码");
		
		jl1.setBounds(20,10,400,50);
		
		jf.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		jf.setLocation(300,300);
		jf.setSize(500,500);
		
		jf.add(jl1);
		jf.add(jpf);
		
		
		
	}

}
