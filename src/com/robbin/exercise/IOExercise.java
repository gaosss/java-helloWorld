//重点掌握IO流，监听输入

 //创建 InputStreamReader类实例 isr

//创建BufferReader类，参数使用isr 



package com.robbin.exercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cfb jiu=new Cfb();
		jiu.cf();

	}

}

class Cfb
{
	public void cf(){
		try{
		//输入流，从键盘接收数
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		//给出提示
		System.out.println("请输入1-9，按0 退出:");
		//从控制台读取一行数据
		String a1 = br.readLine();
		//把String 转为 int
		int num1=Integer.decode(a1);
		for(int i=1;i<=num1;i++){
		for(int j=1;j<=i;j++){
		System.out.print(i+"×"+j+"="+(i*j)+"\t");
		}
		System.out.println();
		}
		}catch(Exception e){
		e.printStackTrace();
		}
		}
	
}
