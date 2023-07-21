package pack3;

public class Test26Tv extends Test26Jepum{
	public Test26Tv() {
		//super(); 생략되있음
		System.out.println("Tv 생성자");
	}
	
	@Override
	public void volumeControl() {
		// 부모가 가진 추상메소드를 오버라이딩 강요 당함
		System.out.println("TV 소리 업 다운");
		
	}
	
	@Override
	public void volumeShow() {
		int imsi = volume + 0;
		String ss = "소리 크기룰 보여 줘 ";
		System.out.println(ss + volume);
	}
}
