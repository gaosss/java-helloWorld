package com.robbin.exercise3;


/**
* 功能:事件处理机制
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Listener_01 extends JFrame implements ActionListener{
	
	//定义组件
	JPanel mp=null;
	JButton jb1,jb2;
	public static void main(String[] args) {
		Listener_01 win=new Listener_01();
	}

//构造函数
	public Listener_01(){
		//创建组件
		mp=new JPanel();
		jb1=new JButton("黑色");
		jb2=new JButton("红色");
		//设定布局管理器
		//加入组件
		mp.setBackground(Color.black);
		this.add(mp);
		this.add(jb1,BorderLayout.NORTH);
		this.add(jb2,BorderLayout.SOUTH);
		//猫类在监听
		Cat mycat1=new Cat();
		jb1.addActionListener(mycat1);
		jb2.addActionListener(mycat1);
		//注册监听
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		//指定action 命令
		jb1.setActionCommand(jb1.getName());
		System.out.println(jb1.getName());
		jb2.setActionCommand("红");
		//JFrame 窗体设置
		this.setTitle("事件处理机制");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//对事件处理的方法
	public void actionPerformed(ActionEvent e) {
		//判断是哪个按钮被点击
		if(e.getActionCommand().equals("黑色")){
			System.out.println("点击了黑色按钮");
			mp.setBackground(Color.BLACK);
		}else if(e.getActionCommand().equals("红")){
			System.out.println("点击了红色按钮");
			mp.setBackground(Color.RED);
		}else{
			System.out.println("不知道");
		}
	}
}


class Cat implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("黑色")){
			System.out.println("Cat 也知道你按下了黑色按钮");
		}else if(arg0.getActionCommand().equals("红")){
			System.out.println("Cat 也知道你按下了红色按钮");
		}else {
			System.out.println("Cat 也不知道");
		}
	}
}