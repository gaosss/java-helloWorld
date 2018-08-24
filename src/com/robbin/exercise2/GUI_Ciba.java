package com.robbin.exercise2;

//gui 编程实践--金山词霸2007
//涉及到新的Swing 组件：
//1、拆分窗格(JSplitPane)属于容器类组件[Window009.java]
/**
* 拆分窗格(JSplitPane)的使用
*/
import java.awt.*;
import javax.swing.*;
public class GUI_Ciba extends JFrame
{
	//定义组件
	JSplitPane jsp;
	JList jl;
	JLabel jlb;
	
	public static void main(String[] args) 
	{
		GUI_Ciba win=new GUI_Ciba();
	}

	//构造函数
	public GUI_Ciba()
	{
		//建立组件
		String[] words={"boy","girl","bird","close"};
		jl=new JList(words);
		jlb=new JLabel(new ImageIcon("images/ciba.jpg"));//访问时路径\\或/
		//拆分窗格
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jl,jlb);
		//可以收缩变化
		jsp.setOneTouchExpandable(true);
		//设定布局管理器(JFrame 本身就是BorderLayout 布局)
		//加入组件
		this.add(jsp);
		//设置窗体
		this.setTitle("金山词霸2007");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
