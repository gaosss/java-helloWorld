import java.awt.Color;

import com.robbin.exercise.*;
public class HelloWorld {

	//swap 方法的声明
	public static void swap(float a,int b){
	int t ;
	t = (int)a;
	a=b;
	b=t;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		
		for (int i = 0 ; i < 10; i++)
		{
			System.out.println(i);
			if (i == 5)
			{break;}
		}
	
	
	}
		


}



class Bullet
{
	int x,y;
	int speed =0;
	int direction;
	Color color = Color.WHITE;
	boolean isAlive = true;
	
	public Bullet (int x, int y,int direction, int speed) 
	{
		
	}
	public Bullet() 
	{
		
	}
}
