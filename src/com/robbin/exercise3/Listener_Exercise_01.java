//1、先画一个小球
//2、控制小球方向


package com.robbin.exercise3;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//import com.robbin.exercise4.MyPanelBall;

public class Listener_Exercise_01 extends JFrame {
	
	MyPanelBall mpb = null;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listener_Exercise_01 le = new Listener_Exercise_01();
	}



	Listener_Exercise_01()
	{
		mpb = new MyPanelBall();
		this.addKeyListener(mpb);
	
		
		this.add(mpb);
		
		this.setTitle("Ball");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

}

class MyPanelBall extends JPanel implements KeyListener
{

	private int x = 30;
	private int y = 30;
	
	
	public void paint (Graphics g) 
	{
		
		
		super.paint(g);
		
		g.fillOval(x, y, 30, 30);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
		if (e.getKeyCode()== KeyEvent.VK_RIGHT) 
		{
			x++;			
			//this.repaint();
		}
		
		if (e.getKeyCode()== KeyEvent.VK_LEFT) 
		{
			x--;			
			
		}
		
		if (e.getKeyCode()== KeyEvent.VK_UP) 
		{
			y-=5;			
			
		}
		if (e.getKeyCode()== KeyEvent.VK_DOWN) 
		{
			y+=5;			
			
		}
		
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}