package pack3;

public class Salesman extends Regular{
	
	public Salesman(String irum, int nai, int salary, int sales, double commission) {
		super(irum, nai, salary);
		this.sales = sales;
		this.commission = commission;
	}

	private int sales;
	private double commission;
	
	@Override
	double pay() {
		return super.pay() + sales*commission;
	}
	
	@Override
	void print() {
		display();
		System.out.print(" 수령액:" + pay());
	}
	
}
