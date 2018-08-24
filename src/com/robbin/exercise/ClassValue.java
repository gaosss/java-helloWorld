package com.robbin.exercise;


//充分理解类对象的相互赋值

public class ClassValue {

	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person2 a=new Person2();
		a.setAge(10);
		a.setName("小明");
		
		System.out.println("a.name = "+ a.getName() + "a.age = "+ a.getAge() );
		
		
		Person2 b = new Person2();
		
		//b=a;
		
		System.out.println("b.name = "+ b.getName() + "b.age = "+ b.getAge() );
		
		b.setAge(100);
		
		System.out.println("b.name = "+ b.getName() + "b.age = "+ b.getAge() );
		
		System.out.println("a.name = "+ a.getName() + "a.age = "+ a.getAge() );
		
//=======================================================================================
//类方法使用方式
		Person pp = new Person();
		pp.Jisuan();
		pp.Jisuan(10);
		int xx = pp.Jisuan(10, 20);
		
		System.out.println(xx);
		
		}


//	public static void swap(int a, int b) {
//		// TODO Auto-generated method stub
//		int t=a;
//		a=b;
//		b=t;
//		
//	}


}


 class Person2 
{
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int age;
	private String name;
	
}
 
 class Person 
{
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int age;
	private String name;
	
	public void Jisuan ()
	{
		System.out.println("这是无参数的计算");
	}
	public void Jisuan (int a)
	{
		System.out.println("这是有参数的计算");
	}
	public int Jisuan (int a, int b) 
	{
		return (a+b);
	}
}