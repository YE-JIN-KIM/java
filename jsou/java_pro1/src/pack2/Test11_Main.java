package pack2;

public class Test11_Main {

	public static void main(String[] args) {
		//System.out.println("args :" + args[3]);
		System.out.println("어쩌구 저쩌구/...");
		
		// Test11_Programmer 형 객체 생성
		Test11_Programmer tom = new Test11_Programmer();
		System.out.println("tom의 별명은 " + tom.nickName);
		//System.out.println("tom의 나이는 " + tom.age);
		System.out.println("tom의 스펙은 " + tom.spec);
		tom.displayData();
		
		System.out.println("getter/setter");
		//System.out.println(tom.age);   private 멤버이므로 접근 불가
		tom.setAge(30);
		System.out.println("tom의 나이는 " + tom.getAge());
		
		System.out.println();
		System.out.println("모토 : " + tom.motto);
		Test11_Programmer.myMethod();
		//tom.pi = 123;   // final 값은 수정 불가
		System.out.println("파이 값은 " + tom.PI);
		
		System.out.println("------------");
		//Test11_Programmer james;
		
	}

}
