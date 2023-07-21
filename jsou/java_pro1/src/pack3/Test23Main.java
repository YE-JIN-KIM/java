package pack3;

public class Test23Main {

	public static void main(String[] args) {
		// 상속 관련
		Test23Dog dog = new Test23Dog();
		dog.print();
		System.out.println(dog.callName());
		
		System.out.println("HouseDog-----------");
		Test23HouseDog hd = new Test23HouseDog("집개");
		hd.print();
		hd.show();
		System.out.println(hd.callName());
		
		System.out.println("\n\nWolfDog-----------");
		Test23HouseDog wolfDog = new Test23HouseDog("늑대");
		wolfDog.print();
		wolfDog.show();
		System.out.println(hd.callName());
		//wolfDog.wolfDisplay();
		
		System.out.println("---");
		//Test23WolfDog bushdog = wolfDog;
		//bushdog.wolfDisplay();
		
		wolfDog=null;
		//bushdog.wolfDisplay();
		
	}

}
