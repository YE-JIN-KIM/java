package pack3;

public class Test29James implements Test29Resume{
	// 신입 지원자 James
	private String irum, junhwa, skill;
//	System.out.println("이력서 규격 " + Test29Resume.SIZE);
	
	public Test29James() {
		
	}
	
	@Override
	public void setIrum(String irum) {
		if(irum.equals(null))
			this.irum = "무명";
		else
			this.irum = irum;
	}
	
	@Override
	public void setJunhwa(String junhwa) {
		this.junhwa = junhwa;
		
	}
	
	@Override
	public void print() {
		//Test29Resume.SIZE = "B5";   err : final이기 때문에
		System.out.println("이력서 규격 " + Test29Resume.SIZE);
		System.out.println("성명은: " + irum + ", 전화번호는:" + junhwa);
		System.out.println("보유기술: " + skill);
		
	}
	
	public void setSkill(String skill) {   //tom이 가진 일반 메소드
		this.skill = skill;
	}
}
