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
		//accept()������ǰ�˿� ������пͻ������ӣ����ظÿͻ��˵�socket����
		Socket socket =ss.accept();
		InputStream ips=socket.getInputStream();
		byte []a=new byte[1024];
		int acount=0;
		if((acount=ips.read(a))!=-1){
			System.out.println(new String(a,0,acount));
		}
		//���ͻ���һ�����
		OutputStream out =socket.getOutputStream();
		out.write("�յ��ͻ���".getBytes("gbk"));		
		//ǿ��Ȫ��
		socket.shutdownOutput();//?
	
		out.flush();
		out.close();
		ss.close();
		socket.close();
		ips.close();
	}

}



