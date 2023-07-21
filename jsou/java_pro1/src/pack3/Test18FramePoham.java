package pack3;

import java.awt.Frame;

public class Test18FramePoham {
	Frame frame;  //포함관계
	
	public Test18FramePoham() {
		frame = new Frame("클래스의 포함"); //생성자를 통해 제목 부여1
	}
	
	public void display() {
		//frame.setTitle("클래스의 포함");  //생성자를 통해 제목 부여2
		frame.setSize(500, 300);
		frame.setLocation(200, 200);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Test18FramePoham framePoham = new Test18FramePoham();
		framePoham.display();
	}

}
