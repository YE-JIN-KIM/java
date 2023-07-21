package pack2;

public class Test12_Animal_Main {

	public static void main(String[] args) {
		Test12_Animal tiger = new Test12_Animal();
		tiger.display();
		tiger.display(22);
		tiger.display("호랑이");
		tiger.display(25, "호랭이");
		tiger.display("호돌이", 30);
		
		System.out.println();
		Test12_Animal hen = new Test12_Animal(2, "암탉");
		hen.showData();
		
		System.out.println();
		Test12_Animal dog = new Test12_Animal(4);
		dog.showData();
		dog.display(3, "나는 개라고 해");
		dog.showData();
		
		System.out.println();
		Test12_Animal wolfdog = new Test12_Animal();
		wolfdog.showData();
	}

}
