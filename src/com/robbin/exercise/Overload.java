package com.robbin.exercise;

public class Overload

{
	public static void main(String []args)
	{
		Abc2 abc1=new Abc2();
		System.out.println(abc1.getMax(12,14));
		System.out.println(abc1.getMax(24f,20f));
	}
}

class Abc2
{
//返回较大的整数
	public int getMax(int i,int j)
	{
		if(i>j){
			return i;
		}else{
			return j;
		}
	}
	public float getMax(float a,float b)
	{
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
//如果只是返回类型不一样，能否构成重载？不能够构成重载
/* public double getMax(float d,double c){
if(c>d){
return c;
}else{
return d;
}
}
//如果只是控制访问修饰符不同，能否构成重载？不能够构成重载
protected float getMax(float c,float d){
if(c>d){
return c;
}else{
return d;
}
}*/
}