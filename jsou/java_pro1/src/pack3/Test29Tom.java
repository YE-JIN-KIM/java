package pack3;

public class Test29Tom implements Test29Resume{
	// 신입 지원자 Tom
	private String irum, junhwa, juso;
	
	public Test29Tom() {
		
	}
	
	@Override
	public void setIrum(String irum) {
		this.irum = irum;
	}
	
	@Override
	public void setJunhwa(String junhwa) {
		this.junhwa = junhwa;
		
	}
	
	@Override
	public void print() {
		//Test29Resume.SIZE = "B5";   err : final이기 때문에
		System.out.println("이력서 크기는 " + Test29Resume.SIZE);
		System.out.println("이름: " + irum + ", 전화:" + junhwa + ",주소: " + juso );
	}
	
	public void setJuso(String juso) {   //tom이 가진 일반 메소드
		this.juso = juso;
	}
}
