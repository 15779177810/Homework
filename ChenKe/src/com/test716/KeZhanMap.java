package com.test716;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class KeZhanMap extends Map
{
	static Image ag;//客栈
	//创建李逍遥对象
	LXY lxy =new LXY();
	int x;
	int y;
	
	boolean flag;
	static{
		try {
			ag=ImageIO.read(new File("img\\客栈\\0.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	//简单来说就是重写paint方法，然后调用画笔的drawImage这个方法。
	//paint 只会调用一次
	public void paint(Graphics g) {
		g.drawImage(ag,0-x,0-y,null);
	
		//!!!!!!!!!
		lxy.paint(g);
//		g.drawRect(414, 377,30,30);
		int[]xpoints={283-x,209-x,196-x,259-x};
		int[]ypoints={343-y,369-y,329-y,313-y};
//		g.drawPolygon(new Polygon(xpoints,ypoints,xpoints.length));
		//d
		Graphics2D g2d=(Graphics2D)g;
		flag =g2d.hit(new Rectangle(414, 377,30,30),new Polygon(xpoints,ypoints,xpoints.length),true);
		System.out.println(flag);
		//看的到线
	}


	
	
	
	public String keyPressed(KeyEvent e) {
		
		lxy.keyPressed(e);
		//因为这里要用到x  y
		//getKeyCode按下的键的值  返回值为int类型的常量 
				if(e.getKeyCode()==KeyEvent.VK_DOWN){
					y+=5;
				}
				if(e.getKeyCode()==KeyEvent.VK_UP){
					y-=5;
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					x-=5;
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					x+=5;
				}
				//重绘
				repaint();
				if(flag){
				return "客栈到李家村";
				}
				
					return "";			
	}
}

	

