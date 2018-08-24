//功能：GUI 界面开发演示

package com.robbin.exercise2;
import java.awt.*;
import javax.swing.*;
//import javax.swing.JFrame;
public class GUI_BorderLayout extends JFrame {
	
	JButton jb1, jb2,jb3,jb4,jb5;
	GUI_BorderLayout()
	{
		jb1 = new JButton ("East");
		jb2 = new JButton ("West");
		jb3 = new JButton ("North");
		jb4 = new JButton ("South");
		jb5 = new JButton ("Center");
		
		//this.setLayout(new BorderLayout());
		
		String tt = this.getLayout().toString();
		
		System.out.println(tt);
		
		
		this.setLocation(300, 300);
		this.setSize(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//this.add(jb1, BorderLayout.EAST);
		//this.add(jb2, BorderLayout.WEST);
		this.add(jb3, BorderLayout.NORTH);
		this.add(jb4, BorderLayout.SOUTH);
		this.add(jb5, BorderLayout.CENTER);
		
		

		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JFrame jf = new JFrame();

		GUI_BorderLayout broderlayout = new GUI_BorderLayout();
		

		
		
		
		
	
		
		
	}

}
