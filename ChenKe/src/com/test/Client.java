package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
//import java.net.UnknownHostException;



public class Client {
public static void main(String[] args) throws Exception {
	//��һ������ ��ʾ��������ip��ַ
	Socket s =new Socket(InetAddress.getByName("192.168.74.135"),9090);
	//��������˷���һ�仰
	
	//��ȡsocket�����ж�Ӧ�������   ���������д��
	OutputStream ots =s.getOutputStream();
	ots.write("��һ��tcp����".getBytes("gbk"));
	//!!!!!!!!!!!
	s.shutdownInput();
	ots.flush();
	//�������Է���˵�����
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

