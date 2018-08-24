package com.robbin.exercise2;

//当父类的一些方法不能确定时，可以用abstract 关键字来修饰该方法[抽象方法]，用
//abstract 来修饰该类[抽象类]。
//抽象类的必要性[Demo124.java]
public class Abstract_01 
{
	public static void main(String[] args) 
	{
		//Animal an=new Animal();抽象类不允许实例化
		Animal an=new Cat();
		an.cry();
		an=new Dog();
		an.cry();
		}
}
//抽象类abstract 关键词
abstract class Animal
{
	String name;
	int age;
	//动物会叫，使用了abstract 抽象方法
	abstract public void cry();;//抽象类中可以没有abstract 抽象方法
	//抽象类内可以有实现方法
	public void sx()
	{
		System.out.println("实现方法");
	}
}
	//当一个子类继承的父类是abstract 抽象类的话，需要程序员把抽象类的抽象方法全部实现。
class Cat extends Animal{
		//实现父类的cry，其实类似上节学习中的子类覆盖父类
		public void cry(){
			System.out.println("猫猫叫");
		}
}
class Dog extends Animal{
	//实现父类的cry，其实类似上节学习中的子类覆盖父类
	public void cry(){
		System.out.println("汪汪叫");
	}
}