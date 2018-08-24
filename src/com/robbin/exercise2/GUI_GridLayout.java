package com.robbin.exercise2;
import java.awt.*;
import javax.swing.*;
public class GUI_GridLayout extends JFrame {
	
	int size = 9;
	JButton[] jbs = new JButton[9];
	//JButton jb1;
	
	GUI_GridLayout () 
	{
		
//		jb1= new JButton("aaa");
//		
//		this.add(jb1);
		

//		
		for (int i = 0; i<size; i++)
		{
			jbs[i] = new JButton(Integer.toString(i+1));
				
		}
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setLocation(300, 300);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		

		for (int ii = 0; ii<size; ii++)
		{
			this.add(jbs[ii]);
		}
		

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GUI_GridLayout gridlayout = new GUI_GridLayout();

	}

}
