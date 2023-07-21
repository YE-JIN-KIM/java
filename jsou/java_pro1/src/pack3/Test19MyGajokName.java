package pack3;

public class Test19MyGajokName {

	public static void main(String[] args) {
		// class의 상속 : 클래스 간 상하위 개념을 도입해 자원의 재활용 : 일반화 관계
		
		Test19Grandfa grandfa = new Test19Grandfa();
		System.out.println("가보 : " + grandfa.gabo);
		System.out.println("가훈 : " + grandfa.gahun);
		System.out.println(grandfa.say());
		grandfa.eat();
		System.out.println("할아버지 나이:" + grandfa.getNai());
		
		System.out.println();
		Test19Grandfa grandfa2 = new Test19Grandfa(82);
		System.out.println(grandfa.say());
		grandfa2.eat();
		System.out.println("할아버지 나이2:" + grandfa2.getNai());
		
		System.out.println("\n아버지 클래스에 대해...");
		Test19Father father = new Test19Father();		
		System.out.println("가보 : " + father.gabo);
		System.out.println("가훈 : " + father.gahun);
		System.out.println(father.say());
		father.eat();
		System.out.println("아버지 나이:" + father.getNai());
		System.out.println("집은:" + father.getHouse());
		
		father.showData();
		
		System.out.println("\n내 클래스에 대해...");
		Test19Me me = new Test19Me();
		System.out.println("가보 : " + me.gabo);
		System.out.println("가훈 : " + me.gahun);
		System.out.println(me.say());
		me.eat();
		System.out.println("아버지 나이:" + me.getNai());
		System.out.println("집은:" + me.getHouse());
		
		me.showData();
		
	}

}
