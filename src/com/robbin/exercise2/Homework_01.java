//已知手掌游戏机一台320 元，MP3 一台260 元。公司举行抽奖大会，公司有18 人，一等奖
//游戏机，二等奖MP3，购入5 台游戏机，13 台MP3。问总价为多少，公司实际平均给每人花
//费多少钱。[Work05.java]



package com.robbin.exercise2;

import java.util.Scanner;

public class Homework_01 {
	
	static int mp3Price = 260;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入价格：");
		
		mp3Price = sc.nextInt();
		
		System.out.println(mp3Price);
		
//		Bonus mp3 = new Bonus();
//		Bonus camera = new Bonus();
//		
//		int totalPrice = 0;
//		int everageCost = 0;
//		
//		totalPrice = mp3.getTotalPrice(260, 13) + camera.getTotalPrice(320, 5);
//		everageCost = totalPrice/18;
//		
//		System.out.println("总价为：" + totalPrice);
//		System.out.println("平均花费：" + everageCost);

	}

}


class Bonus 
{
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	int price = 0;
	int quantity = 0;


	public int getTotalPrice(int unitPrice, int quantity) 
	{
		int totalPrice = 0;
		totalPrice = unitPrice * quantity;
		
		return totalPrice;
	}
	
	
	
}


