package com.robbin.exercise4;

//多线程实例演示[Thread03.java]
/**
*多线程Thread 使用
*1、一个线程通过接收n 来执行1+..+n 得到和
*2、另一线程每隔1 秒输出一次hello world!
*/
public class Thread_Multy_01 {

	public static void main(String[] args) {
		Pig pig=new Pig(10);
		Bird bird=new Bird(10);
		//建立线程
		//Thread t1=new Thread(pig);
		//Thread t2=new Thread(bird);
		//启动线程
		//t1.start();
		//t2.start();
		
		Thread[] ttt = new Thread[2];
		ttt[0] = new Thread(pig);
		ttt[1] = new Thread(bird);
		ttt[0].start();
		ttt[1].start();
		
	}
}


//打印hello world!
class Pig implements Runnable{
	int n=0;
	int times=0;
	public Pig(int n){
		this.n=n;
	}
	public void run(){
		while(true){
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			times++;
			System.out.println(" 我是一个线程， 正在输出第"+times+" 个hello world!");
			if(times==n){
				break;
			}
		}
	}
}

//算数学题
class Bird implements Runnable{//多线程时应使用implements 接口来实现，不要使用extends 继承
	int n=0;
	int res=0;
	int times=0;
	public Bird(int n){
		this.n=n;
	}
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			res+=(++times);
			System.out.println("当前结果是："+res);
			if(times==n){
				System.out.println("最后的结果是："+res);
				break;
			}
		}
	}
}