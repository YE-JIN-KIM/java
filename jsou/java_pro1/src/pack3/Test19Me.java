package pack3;

final public class Test19Me extends Test19Father{
	// Test19Father 하위 클래스 작성은 불가(final을 앞에 적었기 떄문에)
	public Test19Me() {
		System.out.println("내 생성자");
	}
	
	public void Biking() {
		System.out.println("자전거 타고 전국 일주 와우~~");
	}
}
