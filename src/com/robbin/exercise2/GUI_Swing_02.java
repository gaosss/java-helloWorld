package com.robbin.exercise2;

//Swing 组件--下拉框/列表框/流动空格组件[Window008.java]
//在图形用户界面编程中，我们常常会提供用户调查界面，这个时候我们会用到：
//1、下拉框组件(JComboBox)
//2、列表框组件(JList)
//3、滚动窗格组件(JScrollPane)
//特别说明：
//一般来说，列表框组件+滚动窗格组件是结合使用的。目的是让列表框中的选项可以有
//滚动条支持。
/**
* 下拉框(JComboBox)/列表框(JList)/滚动空格(JScrollPane)的使用
*/
import java.awt.*;
import javax.swing.*;
public class GUI_Swing_02 extends JFrame
{
	//定义组件
	JPanel jp1,jp2;
	JLabel jl1,jl2;
	JComboBox<String> jcb;
	JList jl;
	JScrollPane jsp;
	
	public static void main(String[] args) 
	{
		GUI_Swing_02 win=new GUI_Swing_02();
	}

	//构造函数
	public GUI_Swing_02()
	{
		//建立组件
		jp1=new JPanel();
		jp2=new JPanel();
		jl1=new JLabel("你的籍贯:");
		jl2=new JLabel("旅游地点:");
		int[] dd2 = {1,2,3,4};
		String[] jg={"北京","上海","天津","火星"};
		
		String[] dd={"长城","东方明珠","海河","什么什么"};
		jcb=new JComboBox(jg);
		jl=new JList(dd);
		//设置你希望显示多少个选项
		jl.setVisibleRowCount(2);//滚动条显示setVisibleRowCount(?)?为显示条数
		jsp=new JScrollPane(jl);
		//设定布局
		this.setLayout(new GridLayout(3, 1));
		//加入组件
		jp1.add(jl1);
		jp1.add(jcb);
		jp2.add(jl2);
		jp2.add(jsp);
		this.add(jp1);
		this.add(jp2);
		//设置窗体
		this.setTitle("用户注册");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}