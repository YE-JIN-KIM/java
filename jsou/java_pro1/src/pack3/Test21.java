package pack3;

import java.lang.*; // 이것만 생략 가능 (너무 많이 쓰여서)

public class Test21 extends Object{
//public class Test21 { 자바.lang 은 생략가능 임포트 이미 되있음
	public Test21() {
		System.out.println("생성자");
	}
	
	@Override   //annotation / 안적어도 상관없다
	public String toString() {
		// Object 클래스의 toString 메소드를 Override
		return "와우 오묘하군";
	}
	
	public static void main(String[] args) {
		Test21 test21 = new Test21();
		System.out.println(test21);
		
		
		System.out.println(test21.toString());

	}

}
