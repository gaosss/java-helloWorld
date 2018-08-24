package com.robbin.exercise2;
import java.awt.*;
import javax.swing.*;

public class GUI_JPanel extends JFrame
{
	//定义组件
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) 
	{
		GUI_JPanel win=new GUI_JPanel();
	}
	//构造函数
	public GUI_JPanel()
	{
	//创建组件
	jp1=new JPanel();//JPanel 布局默认是FlowLayout 流布局
	jp2=new JPanel();
	jb1=new JButton("西瓜");
	jb2=new JButton("苹果");
	jb3=new JButton("荔枝");
	jb4=new JButton("葡萄");
	jb5=new JButton("桔子");
	jb6=new JButton("香蕉");
	//设置布局管理器(Jpanel 默认流布局)
	//添加JPanel
	
	//jp1.setSize(100, 100);
	jp1.add(jb1);
	jp1.add(jb2);
	jp2.add(jb3);
	jp2.add(jb4);
	jp2.add(jb5);
	//把Panel 加入JFrame
	this.add(jp1, BorderLayout.NORTH);
	this.add(jb6, BorderLayout.CENTER);
	this.add(jp2, BorderLayout.SOUTH);
	//设置窗体
	this.setSize(300, 250);//窗体大小
	this.setLocation(200, 200);//屏幕显示初始位置
	this.setVisible(true);//显示
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 退出窗体后将JFrame 同时关闭
	}
	}
//	------------------------------------------------------------------------------
//	面板(JPanel)组件--注意事项
//
//	1、JPanel 是JComponent 的子类；
//	2、属于容器类组件，可以加入别的组件；
//	3、默认布局管理器是流式布局(FlowLayout)