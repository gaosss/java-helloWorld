package com.robbin.exercise4;

//通过Runnable 接口来实现建立线程实例[Thread02.java]
/**
* 演示如何通过Runnable 接口来开发线程
*/
public class Thread_02{

	public static void main(String []args)  {

	Dog dog=new Dog();
	//创建线程
	Thread t=new Thread();
	
	Thread ttt = new Thread();
	
	t= new Thread(dog);
	ttt= new Thread(dog);
	

	
	
	//启动线程
	t.start();
	ttt.start();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//t.stop();;
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//t.start();
	
	}
}

class Dog implements Runnable{//创建Runnable 接口
	
	public void run(){//重写run 函数
		int times=0;
		while(true){
			try{
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			times++;
			System.out.println("hello,wrold!"+times);
			if(times==10){
				break;
			}
		}
	}
}