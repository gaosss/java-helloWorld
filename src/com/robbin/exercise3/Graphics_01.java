package com.robbin.exercise3;

//java 画图Graphics 绘图类的使用方法

import java.awt.*;
import javax.swing.*;
public class Graphics_01 extends JFrame{
	MyPanel mp=null;
	
	Graphics_01 ()
	{
		mp=new MyPanel();
		//加入组件
		this.add(mp);
		//设置窗体
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义组件
		
		Graphics_01 th=new Graphics_01();
	

}



class MyPanel extends JPanel
{
	//重写(覆盖)JPanel 的paint 方法
	public void paint(Graphics g) 
	{
		//1、调用父类函数，完成初始化任务
		super.paint(g);
		//画一个直线
		g.drawLine(10, 10, 40, 10);
		g.drawLine(50, 50, 40, 40);
		//画矩形边框
		g.drawRect(50, 50, 80, 40);
		//画椭圆边框
		g.drawOval(100, 100, 60, 60);
		//画填充矩形
		g.setColor(Color.blue);
		g.fillRect(10, 150, 70, 70);
		//画填充椭圆
		g.setColor(Color.red);//设置画笔颜色
		g.fillOval(200, 50, 80, 80);
		
		
		
		
	}

}
}
