package pack3;

public interface Test28Volume {  //다중 상속 가능한 메소드 (추상메소드라 일반은 불가)
	void volumeUp(int level);    //public abstract 메소드가 됨
	void volumeDown(int level);
	
	/*
	public void print() {
		System.out.println("일반 메소드는 인터페이스 멤버가 될 수 없다");
	}
	*/
}
