package com.robbin.exercise2;
import java.util.*;


public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		
		Clerk cl1 = new Clerk ("xiaosong", 20, 2000);
		
		hm.put("xiaosong", cl1);
		
		if (hm.containsKey("xiaosong")) 
		{
			System.out.println("yes");
		}
		
		if (hm.containsValue(cl1)) 
		{
			System.out.println("yes cl1");
		}

	}

}


