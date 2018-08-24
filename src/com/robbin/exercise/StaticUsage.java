package com.robbin.exercise;

public class StaticUsage


{
	int b = 10;
	
	
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	static int i=1;
	static
	{
		//该静态区域块只被执行一次
		i++;
		System.out.println("执行一次");
	}
	public StaticUsage()
	{ //建立Demo114()构造函数
		
		System.out.println("执行二次");
		i++;
		
	}
	public static void main(String []args)
	{
		StaticUsage t1=new StaticUsage(); //创建t1 对象实例并调用Demo114 函数
		System.out.println(StaticUsage.i);
		System.out.println(t1.i);
		StaticUsage t2=new StaticUsage();
		System.out.println(t2.i);
		
		StaticUsage su = new StaticUsage();
		
		su.setB(20);

		System.out.println(su.getB());
		
		
		Dogdog dd1 = new Dogdog();
		Dogdog dd2 = new Dogdog();
		
		dd1.age ++;
		dd2.age++;
		
		System.out.println(Dogdog.age);
		System.out.println(dd1.age);
	}
}


class Dogdog
{
	
	static int age = 10;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
			
	}