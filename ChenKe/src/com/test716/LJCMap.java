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
	static Image bg;//��Ҵ�
	//static Image ag;//����ң
	static Image[] aws;//����ɩ
	static Image[] az;//����ι��
	static Image[] xj;//С��
	static Image[] xxj;//СС��
	int x;
	int y;
	int z=0;//����ι��
	int aw=0;//����ɩ
	int j=0;//С��
	int xx=0;//СС��
	 boolean flag;
	static{
		try {
			bg=ImageIO.read(new File("img\\��Ҵ�\\0.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static{
		 aws=new Image[17];
		
		for (int i = 0; i < aws.length; i++) {
			try {
				aws[i]=ImageIO.read(new File("img\\������\\"+i+".png"));
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
				xj[i]=ImageIO.read(new File("img/С��/"+i+".png"));
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
				xxj[i]=ImageIO.read(new File("img/СС��/"+i+".png"));
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
				az[i]=ImageIO.read(new File("img/����ι��/"+i+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	LXY lxy=new LXY();
	//����˵������дpaint������Ȼ����û��ʵ�drawImage���������
	
	//paint ֻ�����һ��
	public void paint(Graphics g) {
		
		//hit����
		//polygon
//		g.drawRect(300, 300, 100, 100);
//		g.setColor(Color.red);
//		g.drawOval(300,300,100,100);
//		g.fillRect(100, 100, 100, 100);
//		g.drawString("abc", 200, 200);
		// ͼ���Ƿ�ˢ��
	
		
		
		g.drawImage(bg, -300-x, -200-y, null);
		g.drawImage(aws[aw],380-x,300-y,null);//?
		g.drawImage(az[z],540-x,420-y,null);//x   y
		g.drawImage(xj[j],520-x,500-y,null);//?
		g.drawImage(xxj[xx],530-x,510-y,null);//?
		//g.drawImage(ag,400,400,null);
		//����ңԭ�ز���  ���м�
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
		//�������¼���ע�� ���������Ҵ��� ���ܷ�����������
		this.addMouseListener(this);
	}
	public void run(){//�����ڲ���
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
					//����
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//�ػ�
					repaint();
				}}}).start();
	}
	
	
	public String keyPressed(KeyEvent e) {
		
		lxy.keyPressed(e);
		//��Ϊ����Ҫ�õ�x  y
		//getKeyCode���µļ���ֵ  ����ֵΪint���͵ĳ��� 
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
				//�ػ�
				//add(kz)
				repaint();
				if(flag){
				return "��Ҵ嵽��ջ";
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

	

