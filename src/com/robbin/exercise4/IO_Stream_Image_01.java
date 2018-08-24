package com.robbin.exercise4;

//3、案例[Io04.java]：图片拷贝
/**
* File 类的基本用法
* io 流--文件字节流
* 图片拷贝--FileInputStream 类与 FileOutputStream 类
*/
import java.io.*;
public class IO_Stream_Image_01 {

	public static void main(String[] args) {
//先将图片读入到内存，再将内存中的图片写入到某个文件
//因为二进制文件只能拿使用字节流来处理
//输入流
FileInputStream fis=null;
//输出流
FileOutputStream fos=null;
try {
fis=new FileInputStream("d:\\ff\\a.jpg");
fos=new FileOutputStream("d:\\a.jpg");
byte []buf=new byte[1024];
int n=0;//记录实际读取到的字节数
//循环读取图片
while((n=fis.read(buf))!=-1){
//输出到指定文件
fos.write(buf);
}
} catch (Exception e) {
e.printStackTrace();
}finally{
//一定要关闭打开的文件流
try {
fis.close();
fos.close();
} catch (Exception e) {
e.printStackTrace();
}
}
}
}