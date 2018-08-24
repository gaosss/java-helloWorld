//装载十只猴子，分别用list map set装载，并且可以查询到


package com.robbin.exercise2;

import java.util.*;

public class Homework_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey11 mk1 = new Monkey11("A01","xiao1",11);
		Monkey11 mk2 = new Monkey11("A02","xiao2",12);
		Monkey11 mk3 = new Monkey11("A03","xiao3",13);
		Monkey11 mk4 = new Monkey11("A04","xiao4",14);
		Monkey11 mk5 = new Monkey11("A05","xiao5",15);
		Monkey11 mk6 = new Monkey11("A06","xiao6",16);
		Monkey11 mk7 = new Monkey11("A07","xiao7",17);
		Monkey11 mk8 = new Monkey11("A08","xiao8",18);
		Monkey11 mk9 = new Monkey11("A09","xiao9",19);
		Monkey11 mk10 = new Monkey11("A10","xiao10",20);
		
		MonkeyManage mm = new MonkeyManage();
		
		mm.add(mk1);
		mm.add(mk2);
		mm.add(mk3);
		mm.add(mk4);
		mm.add(mk5);
		mm.add(mk6);
		mm.add(mk7);
		mm.add(mk8);
		mm.add(mk9);
		mm.add(mk10);
		
		Monkey11 tempm = (Monkey11) mm.get(0);
		
		System.out.println("name is : " + tempm.getName());
	}

}


class MonkeyManage
{
	private List list = new ArrayList();

	
	
	public void add (Monkey11 mk) 
	{
		this.list.add(mk);
		
	}
	
	public Monkey11 get (int index) 
	{
		
		return (Monkey11) list.get(index); 
	}

}


class Monkey11 
{
	
	Monkey11(String index, String name, int age)
	{
		this.setIndex(index);
		this.setName(name);
		this.setAge(age);
	}
	
	private String name, index;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
	
	
	
}