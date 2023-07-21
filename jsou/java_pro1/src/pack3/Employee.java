package pack3;

public abstract class Employee {
	private String irum;
	private int nai;
	
	public Employee(String irum, int nai) {
		this.irum = irum;
		this.nai = nai;
	}
	
	abstract double pay();
	abstract void print();
	
	void display() {
		System.out.print(irum + ", " + nai);
	}
	
}
