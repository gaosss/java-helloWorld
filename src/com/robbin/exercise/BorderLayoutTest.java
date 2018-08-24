package com.robbin.exercise;
import javax.swing.*;
import java.awt.*;


public class BorderLayoutTest extends JFrame {
	
	JButton jb1,jb2,jb3,jb4,jb5;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public BorderLayoutTest() 
	{
		
		//创建组件
		jb1=new JButton("中部");
		jb2=new JButton("北部");
		jb3=new JButton("东部");
		jb4=new JButton("南部");
		jb5=new JButton("西部");
		
		this.add(jb1, BorderLayout.CENTER);
		
	}

}
