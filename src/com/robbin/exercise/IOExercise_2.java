package com.robbin.exercise;

import java.io.BufferedReader;
import java.io.*;
//import java.io.InputStreamReader;

public class IOExercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("please inpiut from 0-3 :");
		
		InputStreamReader isr = new InputStreamReader(System.in);//very important
		BufferedReader br = new BufferedReader (isr);
		
		String ss = null;
		try {
			ss = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i = Integer.parseInt(ss);
				
		switch (i)
		{
		case 0:
			System.out.println("the input # is : " + i);
			break;
		case 1:
			System.out.println("the input # is : " + i);
			break;
		case 2:
			System.out.println("the input # is : " + i);
			break;
		case 3:
			System.out.println("the input # is : " + i);
			break;
		}
	
		
		

	}

}
