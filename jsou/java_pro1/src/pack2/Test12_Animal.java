package pack2;

public class Test12_Animal {
	// method overload : 하나의 클래스 내에 동명 메소드 여러 개를 선언
	private int leg = 4;
	private int age;
	private String name = "강아지";
	public final static int MOUTH = 1;
	
	public Test12_Animal() {
		// 생성자는 내용이 없을 경우 생략 가능		
	}
	
	public Test12_Animal(int leg) {  //생성자 오버로딩
		this.leg = leg;	
	}
	
	public Test12_Animal(int leg, String name) {  //생성자 오버로딩
		this.leg = leg;	
		this.name = name;
	}
	
	
	//--------------------------------//
	public void display() {
		System.out.println("leg:" + leg + ", age:" + age +", name:" + name);		
	}
	
	// 메소드 오버로드 성립 조겁 (1)파라미터가 다를 경우 (갯수, 순서, 타입)
	public void display(int age) {  // 메소드 오버로딩
		System.out.println("leg:" + leg + ", age:" + age +", name:" + name);		
	}
	
	// 타입이 다를 경우
	public void display(String name) {  // 메소드 오버로딩
		System.out.println("leg:" + leg + ", age:" + age +", name:" + name);		
	}
	
	// 갯수가 다를 경우
	public void display(int age, String name) {  // 메소드 오버로딩
		this.age = age;
		this.name = name;
		System.out.println("leg:" + leg + ", age:" + age +", name:" + name);		
	}
	
	// 순서가 다를경우
	public void display(String name, int age) {  // 메소드 오버로딩
		System.out.println("leg:" + leg + ", age:" + age +", name:" + name);		
	}
	
	// 타입이 같아도 갯수가 다를 경우
	public void display(int leg, int age) {  // 메소드 오버로딩
		System.out.println("leg:" + leg + ", age:" + age +", name:" + name);
		System.out.println(MOUTH);
	}
	
	// 오버로딩 X (타입이 중복)
	/*
	public void display(int leg) {  // 메소드 오버로딩
		System.out.println("leg:" + leg + ", age:" + age +", name:" + name);		
	}
	// 앞쪽이 달라고 파라미터 타입이 중복이므로 성립X
	public int display(int leg, int age) {  // 메소드 오버로딩
		System.out.println("leg:" + leg + ", age:" + age +", name:" + name);		
	}
	*/
	

	public void showData() {  
		System.out.println("leg:" + leg + ", age:" + age +", name:" + name);		
	}

	
	
}
