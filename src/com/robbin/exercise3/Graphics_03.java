//画一个圆和一个方

package com.robbin.exercise3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class Graphics_03 extends JFrame implements ActionListener  {

	
	JPanel jp = null;
	JButton jb1, jb2;
	Drawing dr = null;
	JPanel jp2 = null;
	
	Graphics_03()
	{
		dr = new Drawing();
		jp = new JPanel();
		jp2 = new JPanel();
		jp.setBackground(Color.YELLOW);
		jb1 = new JButton("画一个圆形");
		jb2 = new JButton("画一个矩形");
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb1.setActionCommand("圆形");
		jb2.setActionCommand("矩形");
		
		jp.add(jb1);
		jp.add(jb2);
		
		//dr.drawRect();
		
		//this.add(dr.getJpRect());
		
		this.add(dr.getJpRect());
		this.add(jp, BorderLayout.NORTH);
		
		
		this.setTitle("Drawing");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setSize(400, 300);
		
		//this.add(jp2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graphics_03 gra = new Graphics_03();
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("矩形")) 
		{
			dr.drawRect();
			this.add(dr.getJpRect(),BorderLayout.CENTER);
	
			this.setVisible(true);
			
		}
		
		else if (e.getActionCommand().equals("圆形")) 
		{
			dr.drawOval();
			this.add(dr.getJpRect(),BorderLayout.CENTER);
	
			this.setVisible(true);
			
		}
		
		//this.repaint();
	}

}


	
class Drawing
{
	private JPanel jp= null;
	
	Drawing()
	{
		jp =new JPanel();
		
		
	}
	
	public JPanel getJpRect() {
		//System.out.println("hello2222");
		//jpRect.setBackground(Color.RED);
		return jp;
		
	}

	public void setJpRect(JPanel jpRect) {
		this.jp = jpRect;
	}

	public void drawRect() 
	{
		this.jp = new JPanel() {

            // 重写paint方法
            public void paint(Graphics graphics) {
                // 必须先调用父类的paint方法
                super.paint(graphics);
                // 用画笔Graphics，在画板JPanel上画一个小人
                graphics.drawRect(10, 10, 20, 30);// 身体（画矩形）
                
                //this.repaint();
            }
        };

		
	}
	
	public void drawOval() 
	{
		this.jp = new JPanel() {

            // 重写paint方法
            public void paint(Graphics graphics) {
                // 必须先调用父类的paint方法
                super.paint(graphics);
                // 用画笔Graphics，在画板JPanel上画一个小人
                graphics.drawOval(20, 20, 30, 30);
                
                
            }
        };

		
	}
}



