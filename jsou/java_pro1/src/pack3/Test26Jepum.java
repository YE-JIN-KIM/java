package pack3;

public abstract class Test26Jepum {   // 추상메소드 한개라고 있으면 반드시 abstract 넣어줘야한다 (추상클래스)
	public int volume = 0;
	
	public Test26Jepum() {
		System.out.println("추상 클래스 생성자");
	}
	
	public abstract void volumeControl();    // 추상메소드 (반드시 오버라이딩 해야함)
	
	public void volumeShow() {   
		System.out.println("소리 크기 : " + volume);
	}
}

//추상클래스는 일반 메소드로 가질 수 있다
//추상클래스 new 불가 하지만 생성자 호출 될 수 있다.