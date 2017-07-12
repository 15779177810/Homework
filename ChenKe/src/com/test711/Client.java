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
import java.net.Socket; class Client {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Socket s=new Socket(InetAddress.getByName("192.0.0.1"),9000);
		//BufferedInputStream bos=new BufferedInputStream(new FileOutputStream(new File("e:\\QQ图片20170617225535.jpg")));
		BufferedInputStream dis=new BufferedInputStream(new FileInputStream(new File("f:\\QQ图片20170617225535.jpg")));
		//	BufferedReader  br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
		
		byte []a=new byte[1024];
		int b=0;
		while((b=dis.read())!=-1){
			bos.write(a,0,b);
		}
				
	}

}
