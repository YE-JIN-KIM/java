package pack3;


//Adapter Class : 인터페이스의 추상 메소드를 일반 메소드로 오버라이딩하고 자신은 추상 클래스가 됨
// 자식 클래스가 인터페이스의 추상 메소드를 모두 일반 메소드로 만들기 불편함으로 어뎁터 클래스를 사용하도록 함.

abstract public class Test33FlyerAdapter implements Test32Flyer{
	@Override
	public void fly() {
		
	}
	
	@Override
	public boolean isAnimal() {
		return false;
	}
	
}
