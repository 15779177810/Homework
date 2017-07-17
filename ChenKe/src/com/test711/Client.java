package com.test711;

/*import java.io.DataInputStream;
import java.io.DataOutputStream;
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
		
		Socket socket=new Socket("127.0.0.1",9000);
	
		InputStream dis=socket.getInputStream();
	
		FileOutputStream dos=new FileOutputStream(new File("f:\\QQ图片20170617225535.jpg"));					
		byte []a=new byte[1024];
		int b=0;
		while((b=dis.read())!=-1){
			dos.write(a,0,b);
		//	dos.flush();
		}
			socket.close();
			dis.close();
			dos.close();
			
	}

}*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;





/*
 * 服务器端读取图片并发送给客户端，客户端保存图片到本地

 *在当前工程目录下导入一张图片，命名为1.jpg

 */


public class Client {
/*
* 客户端
*/

	public static void main(String[] args) throws Exception {
Socket socket = null;
FileOutputStream fos = null;
InputStream is = null;
try {
socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
fos = new FileOutputStream(new File("E:\\2.jpg"));
is = socket.getInputStream();
byte[] b = new byte[1024];
int len;
while ((len = is.read(b)) != -1) {
fos.write(b, 0, len);
}
} catch (UnknownHostException e) {
e.printStackTrace();
} catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
} finally {
if (fos != null) {
try {
fos.close();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
if (fos != null) {
try {
is.close();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
if (fos != null) {
try {
socket.close();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
}
}




