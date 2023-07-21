package pack3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//내부 클래스 적용 샘플
public class Test35FrameInner extends Frame{
	private MyInner myInner;
	
	public Test35FrameInner() {
		super("내부 클래스 사용");
		setTitle("내부 클래스 사용");   // 방법의 차이만 있을뿐 결과는 동일 둘다 사용가능
		setSize(500, 300);
		setLocation(200, 200);
		setVisible(true);
		
		myInner = new MyInner();
		addWindowListener(myInner);
		addMouseListener(new YourInner());
	}
	
	class MyInner extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	class YourInner extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			setBackground(Color.RED);
		}
	}
	
	public static void main(String[] args) {
		new Test35FrameInner();
		
	}

}
