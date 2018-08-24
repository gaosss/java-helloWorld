package com.robbin.exercise4;

public class ThreadAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindows tw1 = new TicketWindows();
		//TicketWindows tw2 = new TicketWindows();
		//TicketWindows tw3 = new TicketWindows();
		
		
		Thread t1 = new Thread(tw1);
		Thread t2 = new Thread(tw1);
		Thread t3 = new Thread(tw1);
		
		t1.start();
		t2.start();
		t3.start();

	}

}


class TicketWindows implements Runnable
{
  int num =2000;
  Doggie dd = new Doggie();
  String ss = "hello world";
	public void run() 
	{
		while(true)
		{	
			synchronized(ss)
			{
			System.out.println("正在售票" + num +"线程编码为" +Thread.currentThread().getName());
			if (num >0)
			
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			num--;
			
			}else 
			{
				break;
			}
			}
		}	
	}
 
 
}

class Doggie
{
	}