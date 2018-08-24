package com.robbin.exercise4;

import javax.swing.JPanel;

//java 线程的同步--解决问题
//解决问题的关键就是要保证容易出问题的代码的原子性，所谓原子性就是指：当a 线程在
//执行某段代码的时候，别的线程必须等到a 线程执行完后，它才能执行这段代码。也就是
//排队一个一个解决。
//java 处理线程两步的方法非常简单，只需要在需要同步的代码段，用:
//synchronized(Object){你要同步的代码}
//即可。
//售票案例演示[Thread05.java]
/**
* 功能:使用线程的注意事项
* 线程并发同步锁synchronized(Object){}的使用
*/
public class Thread_04 {
	

	


	public static void main(String[] args) {

		
		
		//定义一个售票窗口
		TicketWindow tw1=new TicketWindow();
		//使用三个线程同时启动
		Thread t1=new Thread(tw1);
		Thread t2=new Thread(tw1);
		Thread t3=new Thread(tw1);
		t1.start();
		t2.start();
		t3.start();
	}
}

//售票窗口类
class TicketWindow implements Runnable {

	//共有2000 张票
	private int nums=20;
	private Dog111 myDog=new Dog111();
	//int www= 10;
	
	JPanel jpjp = new JPanel();
	String sss ;
	//sss= "hello";
	public void run() {
		
		sss= "hello";
		while(true){
			//出票速度是1 秒出一张
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//认为if else 要保证其原子性
			//先判断是否还有票
			synchronized(jpjp){//synchronized(this){}为同步代码块
				if(nums>0){
					//显示售票信息
					//Thread.currentThread().getName()得到当前线程的名字
					System.out.println(Thread.currentThread().getName()+"正在售出第"+nums+"张票");
							nums--;
				}else{
					//售票结束
					break;
				}
			}
		}
	}
}
class Dog111{
}