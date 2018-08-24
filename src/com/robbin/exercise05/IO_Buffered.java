package com.robbin.exercise05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO_Buffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1 = new File ("d:\\ttt\\no.txt");
		File f2 = new File ("d:\\no.txt");
		FileReader fr = null;
		FileWriter fw = null;
		String s = "";
		try {
			 fr = new FileReader (f1);
			 fw = new FileWriter (f2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		try {
			
			while ((s = br.readLine()) != null)
			{
				//s = br.readLine();
				System.out.println(s);
				bw.write(s + "\r\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			bw.write(s);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		finally 
		{
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	
	
	
	
	
	
	
	
	
	}

}
