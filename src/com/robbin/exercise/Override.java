package com.robbin.exercise;

//子类方法覆盖父类方法[Demo120.java]
public class Override
{
	public static void main(String []args)
	{
		//创建一只猫
		Cat cat1=new Cat();
		cat1.cry();
		Dog dog1=new Dog();
		dog1.cry();
	}
}

//动物类
class Animal
{
	int age;
	String name;
	//都会叫
	public void cry()
	{
		System.out.println("我是动物，不知道怎么叫");
	}
}
//猫猫类
class Cat extends Animal
{
	//覆盖父类方法
	public void cry()
	{
		System.out.println("猫猫叫!");
	}
}
//狗狗类
class Dog extends Animal
{
	//覆盖父类方法
	public void cry()
	{
		System.out.println("汪汪叫!");
	}
}