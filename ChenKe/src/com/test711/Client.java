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
		// TODO �Զ����ɵķ������
		
		Socket socket=new Socket("127.0.0.1",9000);
	
		InputStream dis=socket.getInputStream();
	
		FileOutputStream dos=new FileOutputStream(new File("f:\\QQͼƬ20170617225535.jpg"));					
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
 * �������˶�ȡͼƬ�����͸��ͻ��ˣ��ͻ��˱���ͼƬ������

 *�ڵ�ǰ����Ŀ¼�µ���һ��ͼƬ������Ϊ1.jpg

 */


public class Client {
/*
* �ͻ���
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




