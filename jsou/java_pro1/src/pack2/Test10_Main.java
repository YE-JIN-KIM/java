package pack2;

public class Test10_Main {

	public static void main(String[] args) {
		// 응용 피로그램 시작을 위해 main를 임의의 클래스 안에 적어줌.
		Test10_Car car1 = new Test10_Car();  // 클래스(설계도)를 근거로 기억장소를 확보하고 객채가 만들어짐,  instance  됨
		System.out.println(car1); 
		System.out.println(car1.irum);
		System.out.println(car1.wheel);
		//System.out.println(car1.airBag);  //private 는 같은 클래스내에서만 사용가능 다른 클래스에 있기때문에 나오지않음
		car1.abc();
		
		System.out.println();
		Test10_Car car2 = new Test10_Car();
		car2.abc();
		System.out.println();
		System.out.println(car1 + " " + car1.hashCode()); 
		System.out.println(car2 + " " + car2.hashCode());
		System.out.println(car1 == car2);  //객체 주소 비교
		System.out.println(car1.getClass());
		System.out.println(car1.getClass() == car2.getClass());  // 객체 타입 비교
	}

}
