package pack3;

import java.awt.Frame;

public class Test20FrameSangsok extends Frame{
	public Test20FrameSangsok() {
		super("클래스의 상속");
	}
	
	public void display() {
		/*
		setTitle("클래스의 상속");
		this.setTitle("클래스의 상속");  // 여기서 보고 없으면 부모클래스로 올라간다
		super.setTitle("클래스의 상속");  //바로 부모클래스로 올라간다
		*/
		setSize(800, 300);
		//this.setSize(500, 300); 
		//super.setSize(500, 300); 셋다 동일한 문장(현재 없으니 부모클래스로)	
		setLocation(-100, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		//Test20FrameSangsok frameSangsok = new Test20FrameSangsok();
		//frameSangsok.display();
		new Test20FrameSangsok().display();
	}

}
