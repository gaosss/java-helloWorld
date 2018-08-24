package com.robbin.exercise2;

//实现接口VS 继承类
//java 的继承是单继承，也就是一个类最多只能有一个父类，这种单继承的机制可保证类的
//纯洁性，比C++中的多继承机制简洁。但是不可否认，对子类功能的扩展有一定影响。所以：
//1、实现接口可以看作是对继承的一种补充。(继承是层级式的，不太灵活。修改某个类就
//会打破继承的平衡，而接口就没有这样的麻烦，因为它只针对实现接口的类才起作用)
//2、实现接口可在不打破继承关系的前提下，对某个类功能扩展，非常灵活。
////实例：建立子类并继承了父类且连接多个接口[Demo126.java]
public class InterfaceVsExtends 
{
	public static void main(String[] args) 
	{
		System.out.println("继承了Monkey 父类");
		Monkey mo=new Monkey();
		mo.jump();
		LittleMonkey li=new LittleMonkey();
		li.swimming();
		li.fly();
		li.jump();
	}
}
//接口Fish
interface Fish
{
	public void swimming();
}
//接口Bird
interface Bird
{
	public void fly();
}

//建立Monkey 类
class Monkey
{
	int name;
	//猴子可以跳
	public void jump()
	{
		System.out.println("猴子会跳!");
	}
}
//建立LittleMonkey 子类并继承了Monkey 父类并连接了Fish 和Bird 接口
class LittleMonkey extends Monkey implements Fish,Bird
{
	public void swimming() 
	{
		System.out.println("连接了Fish 接口!");
	}
	public void fly() 
	{
		System.out.println("连接了Bird 接口!");
	}
}