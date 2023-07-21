package pack3;

public class Test26Radio extends Test26Jepum{
	public Test26Radio() {
		//super(); 생략되있음
		System.out.println("라디오 생성자");
	}
	
	@Override
	public void volumeControl() {
		// 부모가 가진 추상메소드를 오버라이딩 강요 당함
		System.out.println("라디오 소리 올리고 내리기");
		
	}
}
