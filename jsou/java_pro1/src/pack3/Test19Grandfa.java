package pack3;

public class Test19Grandfa {   //할아버지 클래스
	private int nai = 80;  //상속에서 제한됨
	public String gabo = "상감청자";
	protected String gahun = "바르게 살자";   //protected : 이게 있다면 자식이 있을거다 , 다른 패키지에서 자식 클래스에서만 public
	
	public Test19Grandfa() {
		System.out.println("할아버지 생성자");
	}
	
	public Test19Grandfa(int nai) {
		this();  // 생성자를 부르려면 반드시 먼저 적어야한다
		System.out.println("할아버지 !!");
		this.nai = nai;
	}
	
	public String say() { 
		return "할아버지 말씀 : 열씨미 일허자";
	}
	
	public void eat() {
		System.out.println("밥은 맛있게 ...");
	}
	
	public int getNai() {
		return nai;
	}
}
