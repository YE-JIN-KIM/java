package pack3;

public class Test19Father extends Test19Grandfa{  //클래스의 상속 (is clasa)
	private int nai =55;
	private int house = 1;
	public String gabo = "물병";   //은닉화
	
	public Test19Father() {
		super();  //부모생성자 호출 문구, 생략 가능
		System.out.println("아버지 생성자 만세");
	}
	
	public Test19Father(int n) {
		super(n);
	}
	
	// final을 적으면 얘의 자식은 오버라이딩 불가
	final public String say() {  // method override (안에 내용은 달라도 됨)
		String abc = "아버지 말씀 : 상속을 이해하자";
		//gabo = "korea";  final을 앞에 적었으므로 수정 불가
		return abc;
	}
		
	public int getNai() {  // method override
		int imsi = 100;
		return nai + imsi -3;
	}
	
	public int getHouse() {  // Father 고유 멤버
		return house;
	}
	
	public void showData() {  
		System.out.println("showData 실행 결과");
		String gabo = "항아리";
		System.out.println(gabo);  //같은 멤버안에서 먼저 찾는다
		System.out.println(this.gabo);
		System.out.println(super.gabo);
		
		System.out.println(getNai()); // this 적는거랑 완전 동일
		System.out.println(this.getNai());
		System.out.println(super.getNai());
	}
	
}
