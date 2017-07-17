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
import javax.net.ssl.KeyManager;
import javax.swing.JPanel;

public class LJCMap extends  Map implements  MouseListener
{
	static Image bg;//李家村
	//static Image ag;//李逍遥
	static Image[] aws;//阿旺嫂
	static Image[] az;//阿珠喂鸡
	static Image[] xj;//小鸡
	static Image[] xxj;//小小鸡
	int x;
	int y;
	int z=0;//阿珠喂鸡
	int aw=0;//阿旺嫂
	int j=0;//小鸡
	int xx=0;//小小鸡
	 boolean flag;
	static{
		try {
			bg=ImageIO.read(new File("img\\李家村\\0.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static{
		 aws=new Image[17];
		
		for (int i = 0; i < aws.length; i++) {
			try {
				aws[i]=ImageIO.read(new File("img\\阿旺婶\\"+i+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static{
		 xj=new Image[2];
		
		for (int i = 0; i < xj.length; i++) {
			try {
				xj[i]=ImageIO.read(new File("img/小鸡/"+i+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static{
		 xxj=new Image[2];
		
		for (int i = 0; i < xxj.length; i++) {
			try {
				xxj[i]=ImageIO.read(new File("img/小小鸡/"+i+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static{
		az=new Image[6];
		for (int i = 0; i < az.length; i++) {
			try {
				az[i]=ImageIO.read(new File("img/阿珠喂鸡/"+i+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	LXY lxy=new LXY();
	//简单来说就是重写paint方法，然后调用画笔的drawImage这个方法。
	
	//paint 只会调用一次
	public void paint(Graphics g) {
		
		//hit方法
		//polygon
//		g.drawRect(300, 300, 100, 100);
//		g.setColor(Color.red);
//		g.drawOval(300,300,100,100);
//		g.fillRect(100, 100, 100, 100);
//		g.drawString("abc", 200, 200);
		// 图像是否刷新
	
		
		
		g.drawImage(bg, -300-x, -200-y, null);
		g.drawImage(aws[aw],380-x,300-y,null);//?
		g.drawImage(az[z],540-x,420-y,null);//x   y
		g.drawImage(xj[j],520-x,500-y,null);//?
		g.drawImage(xxj[xx],530-x,510-y,null);//?
		//g.drawImage(ag,400,400,null);
		//李逍遥原地不动  在中间
		lxy.paint(g);
//		g.drawRect(414, 377,30,30);
		int[]xpoints={700-x,650-x,720-x,755-x};
		int[]ypoints={268-y,277-y,360-y,294-y};
//		g.drawPolygon(new Polygon(xpoints,ypoints,xpoints.length));
		//d
		Graphics2D g2d=(Graphics2D)g;
		flag =g2d.hit(new Rectangle(414, 377,30,30),new Polygon(xpoints,ypoints,xpoints.length),true);
		System.out.println(flag);
	}
	public LJCMap(){
		run();
		//鼠标监听事件的注册 必须放在李家村里 不能放在主场景里
		this.addMouseListener(this);
	}
	public void run(){//匿名内部类
		new Thread(new Runnable(){

		
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					aw++;
					j++;
					xx++;
					z++;
					if(aw>16){
						aw=0;
					}
					if(j>1){
						j=0;
					}
					if(xx>1){
						xx=0;
					}
					if(z>5){
						z=0;
					}
					//休眠
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//重绘
					repaint();
				}}}).start();
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
				//add(kz)
				repaint();
				if(flag){
				return "李家村到客栈";
				}
				
				return "";
				
	}


	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	}

	

