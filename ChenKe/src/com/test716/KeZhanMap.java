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
	static Image ag;//��ջ
	//��������ң����
	LXY lxy =new LXY();
	int x;
	int y;
	
	boolean flag;
	static{
		try {
			ag=ImageIO.read(new File("img\\��ջ\\0.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	//����˵������дpaint������Ȼ����û��ʵ�drawImage���������
	//paint ֻ�����һ��
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
		//���ĵ���
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
				repaint();
				if(flag){
				return "��ջ����Ҵ�";
				}
				
					return "";			
	}
}

	

