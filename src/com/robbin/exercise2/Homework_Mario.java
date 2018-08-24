package com.robbin.exercise2;

//第十三题
//请大家采用面向对象思想设计超级马里奥游戏人物。并能用键盘输入命令，来控制马里奥的
//位置[Work13.java]
////超级马里奥人物建造及控制台数字操作
import java.util.*;
public class Homework_Mario 
{

	public static void main(String[] args) 
	{
		Scanner sr=new Scanner(System.in);//接收键盘输入
		System.out.println("输入1-25 的数字，你可以移动马里奥，输入其它数字退出");
		int i=sr.nextInt();//将键盘输入数字赋值给i
		Maria m=new Maria();//建立调用Maria 构造方法
		for(int a=i;a<=25;a--)
		{
			if(i<25)
			{
				m.move(i);
				i=sr.nextInt();
			}else
			{
				System.out.println("退出游戏!");
				break;
			}
		}
	}
}
class Maria
{
	int x,y;
	//构造方法，初始化场景；确定地图，Maria 的位置
	public Maria(){
		System.out.println("I'm Maria \n"+"@");
	}
	public void move(int i){
		for(int k=1;k<=25;k++){
			if(k==i){
				System.out.printf("@");
			}else{
				System.out.printf(".");
			}
		}
	}
}