package com.test716;



import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class LXY  {
	static Image bg;//��Ҵ�
	static Image[] lxyu=new Image[8];;//����ң��
	static Image[] lxyd=new Image[8];;//����ң��
	static Image[] lxyl=new Image[8];;//����ң��
	static Image[] lxyr=new Image[8];;//����ң��
	int u;
	int d;
	int r;
	int l;
	int flag=2;
	
	//����һ��static�ṹ����
	//lxy��װ��һ����    ��Ϊ��������Ҳ���õ�
	
	static{
		try {
		//	bg = ImageIO.read(new File("img\\��Ҵ�\\0.png"));
			for (int i = 0; i < lxyu.length; i++) {
				lxyu[i] = ImageIO.read(new File("img\\����ң��\\" + i + ".png"));
				lxyd[i] = ImageIO.read(new File("img\\����ң��\\" + i + ".png"));
				lxyl[i] = ImageIO.read(new File("img\\����ң��\\" + i + ".png"));
				lxyr[i] = ImageIO.read(new File("img\\����ң��\\" + i + ".png"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void paint(Graphics g) {//����д����
	//g.drawImage(bg, -300-x, -200-y,null);
	if(flag==2){
		g.drawImage(lxyd[d],400,300,null);
	}
	if(flag==1){
		g.drawImage(lxyu[u],400,300,null);
	}
	if(flag==4){
		g.drawImage(lxyr[r],400,300,null);
	}
	if(flag==3){
		g.drawImage(lxyl[l],400,300,null);
		}	
}
	


	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//ʹѭ��   
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			
			flag=2;
			d++;
			if(d>7){
				d=0;
			}
		
			
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			
			flag=4;
			r++;
			if(r>7){
				r=0;
			}
			
			
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			
			l++;
			//�ı�����
			flag=3;
			if(l>7){
				l=0;
			}
		
		}
		if(e.getKeyCode()==KeyEvent.VK_UP){
			
			u++;
			flag=1;
			if(u>7){
				u=0;
			}
			
		}
	}
	
}


