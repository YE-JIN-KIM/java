package pack2;

public class Test13_Memory_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test13_Memory sam = new Test13_Memory();
		sam.display();
		sam.display("AAA");
		sam.display("MBC", "LG");
		sam.setSize("SBS",30,"KBS");
		
		System.out.println();
		Test13_Memory sam2 = new Test13_Memory(90);
		sam2.display("TVN", "LG");
		sam2.showData();
	}

}
