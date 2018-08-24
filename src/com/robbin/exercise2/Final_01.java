package com.robbin.exercise2;

//java 面向对象编程(3)--final
//final 概念
//final 中文意思：最后的，最终的。
//final 可以修饰变量或者方法。
//在某些情况下，程序员可能有以下需求：
//1、当不希望父类的某个方法被子类覆盖(override)时，可以用final 关键字修饰。
//2、当不希望类的某个变量的值被修改，可以用final 修饰。如果一个变量是final，则必
//须赋初值，否则编译出错。
//3、当不希望类被继承时，可以用final 修饰。
//final 方法的使用[Demo128.java]
public class Final_01 
{
	public static void main(String[] args) 
	{
		Aaa aaa=new Aaa();
		aaa.show();
		//aaa.b =20;
		Bbb bbb=new Bbb();
		bbb.show();
		//bbb.b = 100;

	}
}
class Aaa
{
	int a=0;//如果a 不赋初值,a 是0。定义类型后应赋值
	//圆周率不让修改
	//带有final 修饰的变量命名时应有_下划线来区分表示。这是java 程序员的标准。
	final float reate_1=3.1415926f;//使用final 可以保证，需要强制不被修改的数据一定要用final 锁定
	final int b = 1;
	//使用final 定义变量时一定要赋初值否则报错。
	//b=1;
	final public void sendMes()
	{
		//给成员方法用final 来修饰则表示不可以被修改，不可被覆盖。
		System.out.println("发送消息");
	}
	public void show()
	{
		System.out.println("a="+a);
	}
}
final class Bbb extends Aaa
{
	//定义类前加final 表示该类不允许被继承
	public Bbb()
	{
		a++;
		//reate_1=reate+1;
	}
	/*public void sendMes(){
	System.out.println("发送消息")
	}*/
}
//final--注意事项
//1、final 修饰的变量又叫常量，一般用XX_XX_XX 来命名。(带下划线)
//2、final 修饰的变量在定义时，必须赋值，并且以后不能再赋值。
//final--什么时候用
//1、因为案例的考虑，类的某个方法不允许修改。
//2、类不会被其它的类继承。
//3、某些变量值是固定不变的，比如圆周率3.1415926