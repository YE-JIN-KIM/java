package pack3;

public class Regular extends Employee{
	private int salary;
	
	public Regular(String irum, int nai, int salary) {
		super(irum, nai);
		this.salary = salary;
	}
	
		
	@Override
	double pay() {
		return salary;
	}
	
	@Override
	void print() {
		display();
		System.out.print(" 급여:" + pay());
	}
	
	
	
}
