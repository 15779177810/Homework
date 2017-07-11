package com.test;



import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;

import java.io.OutputStream;


public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(9090);
		//accept()监听当前端口 ，如果有客户端连接，返回该客户端的socket对象
		Socket socket =ss.accept();
		InputStream ips=socket.getInputStream();
		byte []a=new byte[1024];
		int acount=0;
		if((acount=ips.read(a))!=-1){
			System.out.println(new String(a,0,acount));
		}
		//给客户端一个输出
		OutputStream out =socket.getOutputStream();
		out.write("收到客户端".getBytes("gbk"));		
		//强制泉流
		socket.shutdownOutput();//?
	
		out.flush();
		out.close();
		ss.close();
		socket.close();
		ips.close();
	}

}



