package pack3;

public class Test28VolumeMain {

	public static void main(String[] args) {
		// Test28Volume test28Volume = new Test28Volume(); 객체 생성 불가
		Test28Volume test28Volume = null; 
		
		Test28Radio radio = new Test28Radio();
		Test28Tv tv = new Test28Tv();
		
		test28Volume = radio;
		test28Volume.volumeUp(5);
		test28Volume.volumeDown(3);
		System.out.println();
		test28Volume = tv;
		test28Volume.volumeUp(5);
		test28Volume.volumeDown(3);

	}

}
