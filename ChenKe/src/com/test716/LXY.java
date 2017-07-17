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
	static Image bg;//李家村
	static Image[] lxyu=new Image[8];;//李逍遥上
	static Image[] lxyd=new Image[8];;//李逍遥下
	static Image[] lxyl=new Image[8];;//李逍遥左
	static Image[] lxyr=new Image[8];;//李逍遥右
	int u;
	int d;
	int r;
	int l;
	int flag=2;
	
	//放在一个static结构快中
	//lxy封装成一个类    因为其他场景也会用到
	
	static{
		try {
		//	bg = ImageIO.read(new File("img\\李家村\\0.png"));
			for (int i = 0; i < lxyu.length; i++) {
				lxyu[i] = ImageIO.read(new File("img\\李逍遥上\\" + i + ".png"));
				lxyd[i] = ImageIO.read(new File("img\\李逍遥下\\" + i + ".png"));
				lxyl[i] = ImageIO.read(new File("img\\李逍遥左\\" + i + ".png"));
				lxyr[i] = ImageIO.read(new File("img\\李逍遥右\\" + i + ".png"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void paint(Graphics g) {//方法写错了
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
		//使循环   
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
			//改变坐标
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


