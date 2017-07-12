package com.test711;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		ServerSocket s=new ServerSocket(9000);//InetAddress.getByName("192.0.0.1"),
		Socket socket=s.accept();
		BufferedInputStream dis=new BufferedInputStream(socket.getInputStream());
	//	BufferedReader  br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File("e:\\QQ图片20170617225535.jpg")));
		
		byte []b=new byte[1024];
		int a=dis.read(b);
		while(a!=-1){
			bos.write(b,0,a);
			bos.flush();
		}
		bos.close();
		dis.close();
	}

}
