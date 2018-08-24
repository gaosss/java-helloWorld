package com.robbin.exercise4;

import java.io.*;

public class FileIOOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fff = new File ("d:\\ttt\\no.txt");
	
		FileOutputStream fos = null;
	
		try {
			fos = new FileOutputStream (fff);
			String s = "VRP(Versatile Routin"
					+ "g Platform)即通用路由平台，是华"
					+ "为在通信领域多年的研究经验结晶"
					+ "，是华为所有基于IP/ATM构架的数据通信产"
					+ "品操作系统平台。运行VRP"
					+ "操作系统的华为产品包括路由器、局域网交换机、ATM交换机、拨号访问服"
					+ "务器、IP电话网关、电信"
					+ "级综合业务接入平台、智能"
					+ "业务选择网关，以及专用硬件防火墙等。VRP(Vers"
					+ "atile Routing Platform)即通用路由平台，是华为在通信领域多年的研究经验结晶，是华为所有基于"
					+ "P/ATM构架的数据通信产品操作系统平台。运行VRP操作系统的华为产品包括路由器、局域网交换机、ATM交换机"
					+ "、拨号访问服务器、IP电话网关、"
					+ "电信级综合业务接入平台、智能业务选择网关VRP(Versatile Routing"
					+ " Platform)即通用路由平台，是华为在通信领域多年的研究经验结晶，是华为所有基于IP/ATM构架的数据通信产"
					+ "品操作系统平台。运行VRP操作系统的华为产品包括路由器、局域网交换机、ATM交换机、拨号访问服务器、IP电话网关"
					+ "、电信级综合业务接入平VRP(V"
					+ "ersatile Routing Platform)即通用路由平台，是华为在通信领域多年的"
					+ "研究经验结晶，是华为所有基于IP/ATM构架的数据通信产品操作系统平台。运行VRP操作系统的华为产品包括路由器、局"
					+ "域网交换机、ATM交换机、拨号访问服务器、IP电话VRP(Versatile Routing Platform)即通用路由平台，"
					+ "是华为在通信领域多年的研究经验结晶，是华为所有基于IP/ATM构架的数据通信产品操作系统平台。运行VRP操作系统的华"
					+ "为产品包括路由器、局域网交换机、ATM交换机、拨号访问服务器、IP电话网关、电信级综合业务接入平台、智能业务选择网关，"
					+ "以及专用硬件防火墙等。网关、电信级综合业务接入平台、智能业务选择网关，以及专用硬件防火墙等。台、智能业务选择网关，以"
					+ "及专用硬件防火墙等。，以及专用硬件防火墙等。";
			//byte [] buffer = new byte[1024];
			fos.write(s.getBytes());
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally 
		{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		
		
		
		
	}

}
