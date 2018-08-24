//演示java集合类用法



package com.robbin.exercise2;

import java.util.*;


public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		List list = new ArrayList();
		
		
		LinkedList ll = new LinkedList();
		Stack st = new Stack();
		
		HashMap hm = new HashMap();
		
		
		
				
		
		Vector vt = new Vector();
		
		System.out.println("al的的大小"+al.size());
		
		Clerk cl1 = new Clerk ("songjiang",50 , 1000f );
		Clerk cl2 = new Clerk ("wuyong",40 , 2000f );
		
		Clerk cl3 = new Clerk ();
		
		
		al.add(cl1);
		al.add(cl2);
		System.out.println("al的的大小"+al.size());
		
		ll.addFirst(cl1);
		
		vt.add(cl1);
		
	
		
		
		
		
		//如何访问AL中的数据
		//Clerk temp = (Clerk) al.get(1);
		//System.out.println("第一个人的名字是："+temp.getName());
		
		//al.remove(0);
		//System.out.println("al的的大小"+al.size());
		//System.out.println("第一个人应该是"+ ((Clerk) (al.get(0))).getName());
		
	}

}


class Clerk
{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	String name ;
	int age ;
	float sal;
	
	Clerk()
	{
		
	}
	
	Clerk (String name, int age, float sal)
	{
		this.name = name ;
		this.age = age;
		this.sal = sal;
		}
	
}