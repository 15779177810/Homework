package com.test716;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

/**
 * ��ʼ��������
 * @author Administrator
 *
 */
public class TestMain  extends  JFrame implements MouseListener,KeyListener{
	//������Ҵ峡������ 
	Map ljc=new LJCMap();
	//KeZhanMap kzm=new KeZhanMap();
	//����ң�Ķ���
	LXY lxy=new LXY();
	public static void main(String[] args) {
		new TestMain();
	}
	public TestMain(){
		//���ô����λ�� ��С
		this.setBounds(100,100,800,600);
		//�رմ���ʱ �رյ�ǰ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(ljc);
//		ljc.setBounds(0, 0, 100, 100);
	//	this.add(lxy);
//		lxy.setBounds(0, 0, 200, 200);
		//���̼����¼�ע��
		this.addKeyListener(this);
		//�ɼ���
		this.setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		// getPoint ��ȡ��Ļ�ϵĵ����������
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
			//ע��
		if("��Ҵ嵽��ջ".equals(msg)){
			//remove ��ljc����  ljc.flag��
			remove(ljc);
			//����������������������������������
			ljc=new KeZhanMap();
			add(ljc);
		//	kzm.keyPressed(e);
			
	}
		}
		if(msg.length()!=0){
		if("��ջ����Ҵ�".equals(msg)){
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
