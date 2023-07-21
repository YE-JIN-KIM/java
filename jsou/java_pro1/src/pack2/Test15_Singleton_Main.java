package pack2;

import java.time.LocalDate;

public class Test15_Singleton_Main {

	public static void main(String[] args) {
		// 싱글턴 패턴(Singleton pattern)
		//특정 클래스에 객체 인스턴스가 하나만 만들어지도록 해주는 패턴.
		//싱글턴 패턴을 사용하면 전역 변수를 사용할 때와 마찬가지로 객체 인스턴스를 어디서든지 액세스 할 수 있게 만들 수 있습니다
		//클래스 인스턴스를 하나만 만들고 그 인스턴스로의 전역 접근을 제공
		
		Test15_Singleton s1 = new Test15_Singleton();
		Test15_Singleton s2 = new Test15_Singleton();
		//두개의 객체의 주소가 다름
		System.out.println(s1 + " " + s2);
		System.out.println(s1.kor + " " + s2.kor);
		
		System.out.println();
		Test15_Singleton ss1 = Test15_Singleton.getInstance();
		Test15_Singleton ss2 = Test15_Singleton.getInstance();
		// 두 개의 객체 주소가 같음 싱글톤을 적용하여
		System.out.println(ss1 + " " + ss2);
		System.out.println(ss1.kor + " " + ss2.kor);
		
		System.out.println();
		LocalDate now = LocalDate.now();   // 싱글톤 
		System.out.println(now.hashCode());
		LocalDate now2 = LocalDate.now();   // 싱글톤 
		System.out.println(now2.hashCode());
		
		System.out.println(now.getYear());
	}
	
}
