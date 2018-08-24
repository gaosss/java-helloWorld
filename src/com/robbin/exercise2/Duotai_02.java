package com.robbin.exercise2;

//用接口实现多态--案例[Demo127.java]
//java 中多态是个难以理解的概念，但同时又是一个非常重要的概念。java 三大特性之一(继
//承，封装，多态)，我们可以从字面上简单理解：就是一种类型的多种状态，以下通过卖小
//汽车的例子说明什么是多态。
////用接口实现多态
public class Duotai_02 
{
	public static void main(String []args)
	{
		CarShop aShop=new CarShop();
		//卖出一辆宝马
		aShop.sellCar(new BMW());
		//卖出一辆奇瑞QQ
		aShop.sellCar(new CheryQQ());
		//卖出一辆桑塔纳
		aShop.sellCar(new Santana());
		System.out.println("总收入："+aShop.getMoney());
	}
}
//汽车接口
interface Car
{
	//汽车名称
	String getName();
	//获得汽车售价
	int getPrice();
}
//宝马
class BMW implements Car
{
	public String getName()
	{
		return "BMW";
	}
	public int getPrice()
	{
		return 300000;
	}
}
//奇瑞QQ
class CheryQQ implements Car
{
	public String getName()
	{
		return "CheryQQ";
	}
	public int getPrice()
	{
		return 20000;
	}
}
//桑塔纳汽车
class Santana implements Car
{

	public String getName()
	{

		return "Santana";
	}
	public int getPrice()
	{
		return 80000;
	}
}
//汽车出售店
class CarShop
{
	//售车收入
	private int money=0;
	//卖出一部车
	public void sellCar(Car car)
	{
		System.out.println("车型："+car.getName()+"单价："+car.getPrice());
		//增加卖出车售价的收入
		money+=car.getPrice();
	}
	//售车总收入
	public int getMoney()
	{
		return money;
	}
}