//九九乘法表，要求行列对齐[Work07.java]
//九九乘法表

package com.robbin.exercise2;

import java.util.Scanner;

public class Homework_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);//调用键盘输入
		System.out.print("请输入1-9 中的一个数：");
		int num = myScanner.nextInt();
		int i = 0, kk=9;
		for (i = 1, kk=8;i<num; i++, kk--) 
		{
			for(int j = 1; j<=i;j++) 
			{
				System.out.print(i+"×"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		//System.out.println()
	}

}


