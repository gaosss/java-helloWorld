package com.robbin.exercise05;

import java.io.*;
public class IO_Char {
public static void main(String[] args) {
//文件取出字符流对象(输入流)
FileReader fr=null;
//写入到文件(输出流)
FileWriter fw=null;
try {
//创建fr 对象
fr=new FileReader("d:\\ff\\hsp.txt");
//创建输出对象
fw=new FileWriter("d:\\hsp.txt");
//创建字符数组
char c[]=new char[1024];
int n=0;
//读入到内存
while((n=fr.read(c))!=-1){
//控制台输出TXT 文件内容
String s=new String(c,0,n);
System.out.println(s);
fw.write(c, 0, n);
}
} catch (Exception e) {
e.printStackTrace();
}finally{
try {
fr.close();
fw.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}
}