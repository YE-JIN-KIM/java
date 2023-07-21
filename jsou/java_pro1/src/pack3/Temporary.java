package pack3;

public class Temporary extends Employee{
	private int ilsu;
	private double ildang;
	
	public Temporary(String irum, int nai, int ilsu, double ildang) {
		super(irum, nai);
		this.ilsu = ilsu;
		this.ildang = ildang;
	}
	
		
	@Override
	double pay() {
		return ildang*ilsu;
	}
	
	@Override
	void print() {
		display();
		System.out.print(" 월급:" + pay());
	}
	
	
	
}
