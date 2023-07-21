package pack2;

public class Test15_Singleton {
	int kor = 10;
	
	//싱글톤 패턴을 적용한 코드
	//장점 : 메모리 절약, 데이터 공유가 편리
	//단점 : 테스트가 불편, 유연성이 떨어짐
	private static Test15_Singleton singleton = new Test15_Singleton();
	public static Test15_Singleton getInstance() {
		return singleton;
	}
}
