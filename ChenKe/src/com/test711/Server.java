package com.test711;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import java.io.OutputStream;
/*
public class Server {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		ServerSocket s=new ServerSocket(9000);//InetAddress.getByName("192.0.0.1"),
		Socket socket=s.accept();
		FileInputStream dis=new FileInputStream(new File("e:\\QQ图片20170617225535.jpg"));
	//	BufferedReader  br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStream os = socket.getOutputStream();
		
		byte []b=new byte[1024];
		int a=0;
		while((a=dis.read(b))!=-1){
			os.write(b,0,a);
		//	dos.flush();
	//		
		}
		socket.shutdownOutput();
		os.close();
		dis.close();
		s.close();
		socket.close();
	}

}*/



/*
* 服务器端
*/
public class Server {
public static void main(String[] args) throws Exception {

ServerSocket ss = null;
Socket socket = null;
FileInputStream fis = null;
OutputStream os = null;
try {
ss = new ServerSocket(9090);
socket = ss.accept();
fis = new FileInputStream(new File("E:\\3.jpg"));
os = socket.getOutputStream();
byte[] b = new byte[1024];
int len;
while ((len = fis.read(b)) != -1) {
os.write(b, 0, len);

}
//socket.shutdownOutput();
}catch (IOException e) {
e.printStackTrace();
} finally {
if (os != null) {
try {
os.close();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
if (fis != null) {
try {
fis.close();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
if (socket != null) {
try {
socket.close();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
if (ss != null) {
try {
ss.close();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
}
}

