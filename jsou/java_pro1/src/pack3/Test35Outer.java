package pack3;

//내부 클래스 : 클래스의 멤버로 클래스를 가질 수 있다.
//특정 클래스 안에서만 사용할 클래스를 선언 하고 이를 내부 클래수(inner class)라고 한다.\

public class Test35Outer {
	private int a;
	Inner inner;
	
	public Test35Outer() {
		System.out.println("Outer 생성자");
		System.out.println("Outer 생성자");
		a = 10;
		inner = new Inner();  //내부 클래스는 내부 클래스를 감싸고 외부 클래스 내에서 생성
	}
	
	public void aa() {
		System.out.println("Outer의 멤버 aa 메소드");
		bb();
		System.out.println("Outer 멤버필드 a:" + a + ", Inner 멤버필드 kbs:" + inner.kbs);
	}
	
	private void bb() {
		System.out.println("Outer 소속 bb 메소드");
	}
	
	class Inner {   //내부 클래스
	//public class Inner extends 어쩌구 implements 저쩌구 이런 것이 가능함/
		private int kbs;
		
		public Inner() {
			System.out.println("Inner 생성자");
			kbs = 9;
		}
		
		void cc() {
			System.out.println("cc -------------");
			System.out.println("내부 클래스 내의 cc 메소드");
			bb();   //outer의 멤버는 바로 호출
			System.out.println("Outer 멤버필드 a:" + a + ", Inner 멤버필드 kbs:" + kbs);
		}
	}
	
	
	
	//-----------------------------
	public static void main(String[] args) {
		Test35Outer outer = new Test35Outer();
		outer.aa();

		System.out.println();
		//Inner inner = new Inner(); 내부 클래스는 외부에 종속되기 때문에 독립적인건 불가능
		//Test35Outer.Inner inner = outer.new Inner();  가능은 하지만 비권장
		//outer.inner.cc(); 가능하지만 비권장
	}
	
	class InnerInner{
		// 내부 클레스 내에 내부 클래스 선언 가능, 비권장
		
	}
}
