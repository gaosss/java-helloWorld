package com.robbin.exercise4;

//java 文件编程--常用io 流
//常用io 流--文件字节流
//1、案例[Io02.java]：读取文件(文件字节输入流使用，目的：FileInputStream 类)把用
//FileInputStream 的对象把文件读入到内存
/**
* File 类的基本用法
* io 流--文件字节流
* FileInputStream 类的使用
*/
import java.io.*;
public class IO_Stream_01 {

	public static void main(String[] args) {
		//得到一个文件对象，f 指向e:\ff\hsp.txt 文件
		File f=new File("d:\\ff\\bbb.txt");
		FileInputStream fis=null;
		try {
			//因为File 没有读写的能力，所以需要使用InputStream 类
			fis=new FileInputStream(f);
			//定义一个字节数组，相当于缓存
			byte []bytes=new byte[100];
			int n=0;//得到实际读取到的字节数
			//循环读取
			while((n=fis.read(bytes))!=-1){
				//把字节转成String
				String s=new String(bytes,0,n);
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//关闭文件流必需放在finally 语句块中
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}