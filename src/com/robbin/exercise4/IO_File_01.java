package com.robbin.exercise4;

//常用io 流--文件对象
//目的：文件数据源File 类介绍(文件流对象中最为重要的File 类，对File 了解后对子类理
//解会更加容易)
//File 类--使用[Io01.java]
/**
* File 类的基本用法
*/
import java.io.*;//必需加载IO 包

public class IO_File_01 {
	
	public static void main(String[] args) {
		//创建一个文件对象
		File f1=new File("d:\\aa.txt");
		
		System.out.println(f1.exists());
//		if(f1.exists()) 
//		{
//			System.out.println("文件已经存在，不能创建");
//		}
		
		//得到文件的路径
		System.out.println("文件路径"+f1.getAbsolutePath());
		//得到文件的大小,字节数
		System.out.println("文件的大小"+f1.length());
		//创建文件夹
		File f3=new File("d:\\ff");
		//判断文件夹是否存在
		if(f3.isDirectory()){
			System.out.println("文件夹存在，不能创建!");
		}else{
			//创建文件夹
			f3.mkdir();
		}
		//创建文件和创建文件夹
		File f2=new File("d:\\ff\\hsp.txt");
		//判断文件是否存在
		if(!f2.exists()){
			//可以创建
			try {
				f2.createNewFile();//创建一个新文件
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("文件存在，不能创建!");
		}
		//列出一个文件夹下面的所有文件
		File f4=new File("d:\\ff");
		//判断文件夹是事存在
		if(f4.isDirectory()){
			//将文件夹的文件，传给lists 数组
			File lists[]=f4.listFiles();
			//遍历数组
			for(int i=0;i<lists.length;i++){
				//输出文件夹下所有文件文件名
				System.out.println("显示出文件名是"+lists[i].getName());
			}
		}
	}
}