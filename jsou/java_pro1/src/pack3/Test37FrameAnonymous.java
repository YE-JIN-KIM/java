package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Test37FrameAnonymous extends Frame{
	public Test37FrameAnonymous(String title) {
	setSize(500, 300);
	setLocation(200, 200);
	setVisible(true);
	
	addWindowListener(new WindowAdapter() { //추상클래스지만 new선언 가능 (예외)
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			setBackground(Color.BLUE);
		}
	});
	}

	public static void main(String[] args) {
		new Test37FrameAnonymous("내부 무명클래스");

	}

}
