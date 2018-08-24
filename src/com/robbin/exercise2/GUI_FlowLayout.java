//流式布局FlowLayout--注意事项
//1、不限制他所管理的组件大小，允许他们有最佳大小
//2、当容器衩缩放时，组件的位置可能变化，但组件的大小不变。
//3、默认组件是居中对齐，可以通过FlowLayout(intalign)函数来指定对齐方式。


package com.robbin.exercise2;
import java.awt.*;
import javax.swing.*;

public class GUI_FlowLayout extends JFrame {
	
	JButton jb1, jb2,jb3,jb4,jb5;
	
	GUI_FlowLayout()
	{

		
		
		jb1 = new JButton ("1");
		jb2 = new JButton ("2");
		jb3 = new JButton ("3");
		jb4 = new JButton ("4");
		jb5 = new JButton ("5");
		
		jb5.setSize(50, 50);
		jb5.setBackground(Color.blue);
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setLocation(300, 300);
		this.setSize(500, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);//禁止改变窗体大小
		this.setTitle("QQ登录");//设置title
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GUI_FlowLayout flowloayout = new GUI_FlowLayout();

	}

}
