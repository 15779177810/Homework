package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
//import java.net.UnknownHostException;



public class Client {
public static void main(String[] args) throws Exception {
	//第一个参数 表示服务器的ip地址
	Socket s =new Socket(InetAddress.getByName("192.168.74.135"),9090);
	//向服务器端发送一句话
	
	//获取socket对象中对应的输出流   向服务器端写入
	OutputStream ots =s.getOutputStream();
	ots.write("第一个tcp程序".getBytes("gbk"));
	//!!!!!!!!!!!
	s.shutdownInput();
	ots.flush();
	//接受来自服务端的内容
	InputStream in=s.getInputStream();
	byte []b =new byte[1024];
	int a=0;
	while((a=in.read(b))!=-1){
		System.out.println(new String(b,0,a));
	}
	ots.close();
	s.close();

}
}

