package com.test716;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

/**
 * 初始化的内容
 * @author Administrator
 *
 */
public class TestMain  extends  JFrame implements MouseListener,KeyListener{
	//创建李家村场景对象 
	Map ljc=new LJCMap();
	//KeZhanMap kzm=new KeZhanMap();
	//李逍遥的对象
	LXY lxy=new LXY();
	public static void main(String[] args) {
		new TestMain();
	}
	public TestMain(){
		//设置窗体的位置 大小
		this.setBounds(100,100,800,600);
		//关闭窗体时 关闭当前程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(ljc);
//		ljc.setBounds(0, 0, 100, 100);
	//	this.add(lxy);
//		lxy.setBounds(0, 0, 200, 200);
		//键盘监听事件注册
		this.addKeyListener(this);
		//可见性
		this.setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		// getPoint 获取屏幕上的点击处的坐标
				System.out.println(e.getPoint());
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
	
	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//ljc.keyPressed(e);
		String msg = ljc.keyPressed(e);
		//String mag=kzm.keyPressed(e);
		if(msg.length()!=0){
			//注意
		if("李家村到客栈".equals(msg)){
			//remove 了ljc对象  ljc.flag将
			remove(ljc);
			//！！！！！！！！！！！！！！！！！
			ljc=new KeZhanMap();
			add(ljc);
		//	kzm.keyPressed(e);
			
	}
		}
		if(msg.length()!=0){
		if("客栈到李家村".equals(msg)){
			remove(ljc);
			//
			ljc=new LJCMap();
			add(ljc);
		//	ljc.keyPressed(e);
			
		}validate();
			repaint();
	}
}
	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
