package com.robbin.exercise2;

//接口的实现[Demo125.java]
//小结：接口是更加抽象的抽象的类，抽象类里的方法可以有方法体，接口里的所有方法都没
//有方法体。接口体现了程序设计的多态和高内聚低偶合的设计思想。
//电脑，相机，u 盘，手机
//usb 接口
interface Usb
{
	int a=1;//加不加static 都是静态的，不能用private 和protected 修饰
	//声明了两个方法
	public void start();//接口开始工作
	public void stop();//接口停止工作
}
//编写了一个相机类，并实现了usb 接口
//一个重要的原则：当一个类实现了一个接口，要求该类把这个接口的所有方法全部实现
class Camera implements Usb
{
	public void start()
	{
		System.out.println("我是相机，开始工作了..");
	}
	public void stop()
	{

		System.out.println("我是相机，停止工作了..");
	}
}
//接口继承别的接口
class Base{
}
interface Tt{
}
interface Son extends Tt{
}
//编写了一个手机，并实现了usb 接口
class Phone implements Usb
{
	public void start()
	{
		System.out.println("我是手机，开始工作了..");
	}
	public void stop()
	{
		System.out.println("我是手机，停止工作了..");
	}
}
//计算机
class Computer
{
//开始使用usb 接口

	public void useUsb(Usb usb)
	{
	usb.start();
	usb.stop();
	}
}
public class Interface_01 
{

	public static void main(String[] args) 
	{
		System.out.println(Usb.a);
		//创建 Computer
		Computer computer=new Computer();
		//创建Camera
		Camera camera1=new Camera();
		//创建Phone
		Phone phone1=new Phone();
		
		
		computer.useUsb(camera1);
		computer.useUsb(phone1);
	}
}





