package com.robbin.exercise3;

//画图Graphics 画图类--画图片--画字[Window015.java]
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
//import java.awt.Toolkit;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Graphics_02 extends JFrame
{
	//定义组件
	MyPanel1 mp=null;
	
	public static void main(String[] args) {
		Graphics_02 th=new Graphics_02();
		}
	
	public Graphics_02(){
		//构建组件
		mp=new MyPanel1();
		//加入组件
		this.add(mp);
		//设置窗体
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
//定义一个MyPanel(我自己的面板是用于绘图和显示绘图的区域)
class MyPanel1 extends JPanel
{
	//重写(覆盖)JPanel 的paint 方法
	public void paint(Graphics g)
	{
		//Graphics 是绘图的重要类，可以把它理解成一只画笔
		//1、调用父类函数，完成初始化任务
		//super.paint(g);
		//在面板上画出图片
		//Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/ciba.jpg"));
		//Image im=Toolkit.getDefaultToolkit().getImage("images/ciba.jpg");
		//实现
		//g.drawImage(im, 0, 0, 200, 100, this);
		//如何画出字
		g.setColor(Color.red);
		g.setFont(new Font("黑体",Font.BOLD,40));
		g.drawString("祖国万岁", 100, 100);
		//画弧形
		g.drawArc(10, 10, 200, 200, -50, -100);
	}
}