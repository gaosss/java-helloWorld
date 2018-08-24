package com.robbin.exercise05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO_Char_Stream {

	public static void main(String[] args) 
	
	{
		//File f1 = new File ("D:\\ttt\\no.txt");
		//File f2 = new File ("D:\\mine.txt");
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("D:\\ttt\\no.txt");
			fw = new FileWriter("D:\\bbb.txt");
			int n = 0;
			char [] c = new char[50];
			//fw.write("hello");
			while ((n = fr.read(c))!= -1)
			{
			//fr.read(c);
			
			//	String s = new String(c, 0 , n);
				//System.out.println(c);
			//fw.w
			fw.write(c, 0,n);
			
			//fw.write(cbuffer.toString());
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally 
		{
			try {
				fr.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

}
