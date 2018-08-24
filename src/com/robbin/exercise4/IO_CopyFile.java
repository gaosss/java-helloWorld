package com.robbin.exercise4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IO_CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1 = new File ("D:\\Learning\\韩顺平_循序渐进JAVA\\韩顺平.循序渐进学.java.从入门到精通.第0讲-开山篇.avi");
		File f2 = new File ("D:\\bbb.avi");
		try {
			FileInputStream fis = new FileInputStream(f1);
			FileOutputStream fos = new FileOutputStream(f2);
			
			int n = 0;
			byte [] buffer = new byte [1024];
			
			while ((n =fis.read(buffer)) !=-1)
			{
				fos.write(buffer, 0, n);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

}
