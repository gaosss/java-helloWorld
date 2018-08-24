package com.robbin.exercise4;

//2、案例[Io03.java]：从键盘接收用户输入内容，并保存到文件中(文件字节输出流，目的：
//FileOutputStream 类)
/**
* File 类的基本用法
* io 流--文件字节流
* FileOutputStream 类的使用
*/
import java.io.*;
public class IO_Stream_02 {

	public static void main(String[] args) {
		File f=new File("d:\\ff\\ss.txt");//直接覆盖写同一个文件
		//字节输出流
		FileOutputStream fos=null;
		if(f.exists()){
			System.out.println("文件已存在");
		}else{
			try {
				fos=new FileOutputStream(f);
				String s="hello,world!\r\n";
				String s1="中国人";
				fos.write(s.getBytes());
				fos.write(s1.getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					fos.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}