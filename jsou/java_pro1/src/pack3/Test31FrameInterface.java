package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test31FrameInterface extends Frame implements WindowListener, MouseListener{
	
	//public Test31FrameInterface("이벤트 처리") {
	public Test31FrameInterface() {   //생성자는 초기화 담당
		setTitle("이벤트 처리");
		
		//frameShow(); // 아래처럼도 가능하지만 간단하게 이렇게만 적어도 가능 (생성자 도 앞부분 생략가능)
	}
	
	public void frameShow() {
		setSize(500,300);
		setLocation(200,200);
		setVisible(true);	
		
		addWindowListener(this);  //현재 클래스(Frame)에 addWindowListener를 장착. - 이제 사용자의 윈도우 이벤트를 수신
		addMouseListener(this);
	}
	
	
	@Override
	public void windowActivated(WindowEvent e) {	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	@Override
	public void windowClosed(WindowEvent e) {}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료하고싶니");
		System.exit(0);
	}
	
	@Override	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("허걱 돌아오다니");
	}	
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("와우 작아졌네");		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
	}
	
	
	//----------------- 클릭할때마다 배경색이 랜덤하게 바꾸기 -------------//
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("클릭");
		//setBackground(Color.BLUE);
		//setBackground(new Color(0, 0, 255));
		//System.out.println((int)(Math.random() * 255));
		int r = (int)(Math.random() * 255);
		int g = (int)(Math.random() * 255);
		int b = (int)(Math.random() * 255);
		setBackground(new Color(r,g,b));
		setTitle("R:" + r + " G:"+ g + " B:" + b);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {}
	
	@Override
	public void mousePressed(MouseEvent e) {}
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	
		
	public static void main(String[] args) {
		Test31FrameInterface frameInterface = new Test31FrameInterface();
		//new Test31FrameInterface();  //앞부분 생략가능
		frameInterface.frameShow();
	}

}
