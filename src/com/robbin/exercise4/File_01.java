package com.robbin.exercise4;

import java.io.*;
//import java.io.FileInputStream;

public class File_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ff = new File("D:\\ttt\\no.txt");
		
		//System.out.println(ff.exists());
		
		byte[] buffer = new byte [1024];
		FileInputStream fis = null;
 		
		try {
			 fis =  new FileInputStream (ff);
			
			//fis.read(buffer);
			
			int n = fis.read(buffer);
			
			
			while (n != -1)
			{
				
				
				String s = new String(buffer , 0, n);
			
				System.out.println(s);
				n  = fis.read(buffer);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally 
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		

		
		
	}

}
