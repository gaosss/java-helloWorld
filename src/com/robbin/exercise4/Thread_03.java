package com.robbin.exercise4;

//线程--深入理解
//
//线程对象只能启动一个线程，见[Thread04.java]
/**
* 功能:使用线程的注意事项
* 不论继承Thread 或实现Rnunable 接口都不能使用start 启同一个线程2 次
*/
public class Thread_03 {

	public static void main(String[] args) {
		Cat11 cat1=new Cat11();
		cat1.start();
	//	cat1.start();//同一个线程，不能启动2 次
		Dog11 dog1=new Dog11();
		Thread t=new Thread(dog1);
	//	Thread t=new Thread(dog1);
		t.start();
		//t.start();同一个线程，不能启动2 次
	}
}
	
//猫类
class Cat11 extends Thread{
	public void run(){
		System.out.println("11");
	}
}

//狗类
class Dog11 implements Runnable{
	public void run(){
		System.out.println("2");
	}
}