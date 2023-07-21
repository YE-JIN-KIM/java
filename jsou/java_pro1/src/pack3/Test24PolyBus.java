package pack3;

public class Test24PolyBus extends Test24PolyCar{
	private int passenger = 10;
	
	public void show() {
		System.out.println("버스");
	}
	
	@Override   //annotation 메타데이터
	public void dispData() {
		System.out.println("버스의 승객은 " + passenger);
		System.out.println("버스의 속도는 " + speed);
	}
}
