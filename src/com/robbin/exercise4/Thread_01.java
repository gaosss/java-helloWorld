package com.robbin.exercise4;

//通过继承Thread 类来实现建立线程实例[Thread01.java]
/**
* 演示如何通过继承Thread 来开发线程
*/
public class Thread_01 {
	
	public static void main(String[] args) {
		//创建一个 Cat 对象
		Cat cat=new Cat();
		//启动线程
		cat.start();//.start()会导致run 函数运行
	}
}

class Cat extends Thread{
	int times=0;
	//重写run 函数
	public void run(){
		while(true){
			//休眠一秒
			//1000 表示1000 毫秒
			try {
				Thread.sleep(5000);//sleep 就会让该线程进入到Blocked 阻塞状态,并释放资源。
			} catch (Exception e) {
				e.printStackTrace();
			}
			times++;
			System.out.println("hello,world!"+times);
			if(times==10){
				//退出线程
				break;
			}
		}
	}
}