package com.robbin.exercise4;
//第二大题：
//1、用循环控制语句打印输出：1+3+5+...+99=?结果
public class Homework_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y= 0;
		for(int i = 1; i < 100; i+=2) 
		{
			y += i;
		}
		
		System.out.println(y);
	}

}
