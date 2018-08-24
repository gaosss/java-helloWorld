// 泛型 = generic

package com.robbin.exercise2;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Generic_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gen<String> gen1=new Gen<String>("aa");//<>可以放任意类型
		//Gen<Birdy> gen2=new Gen<Birdy>(new Birdy());//<>也可以放入定义好的类
		//gen1.showTypeName();
		//gen2.showTypeName();
		//Birdy b1 = new Birdy();
		//Gen<Birdy> gg = new Gen<Birdy>(b1);
	}

}
//定义一个Birdy
class Birdy
{
	public void test1(){
		System.out.println("aa");
	}
	public void count(int a,int b){
		System.out.println(a+b);
	}
}


class Gen <MyT>
{
	

	
	private MyT o;
	
	Gen (MyT o)
	{
		this.o = o;
				
	} 
	
	//得到T 的类型名称
	public void showTypeName(){
		System.out.println("类型是："+o.getClass().getName());
		//通过反射机制，我们可以得到T 这个类型的很多信息
		//得到成员函数名
		
		Method [] m = o.getClass().getDeclaredMethods();
		//Method [] m=o.getClass().getDeclaredMethods();
		//打印
		for(int i=0;i<m.length;i++){
			System.out.println(m[i].getName());//打印函数名列表
		}
	}
}