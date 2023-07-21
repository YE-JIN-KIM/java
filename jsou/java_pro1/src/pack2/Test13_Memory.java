package pack2;

public class Test13_Memory {
	public String name;
	private int size;
	String maker = "삼성";
	
	public Test13_Memory() {
		// 생성자는 내용이 없을 경우 생략 가능		
	}
	
	public Test13_Memory(int size) { 
		this.size = size;	
	}
	
	public void display() {
		System.out.println("name:" + name + ", size:" + size + ", maker:" + maker);
	}
	
	public void display(String name) {
		System.out.println("name:" + name + ", size:" + size + ", maker:" + maker);
	}
	
	public void display(String name, String maker) {  // 메소드 오버로딩
		this.maker = maker;
		this.name = name;
		System.out.println("name:" + name + ", size:" + size + ", maker:" + maker);		
	}
		
	public void setSize(String name, int size, String maker) { 
		this.size = size;
		System.out.println("name:" + name + ", size:" + size + ", maker:" + maker);	
	}
	
	public void showData() {
		System.out.println("name:" + name + ", size:" + size + ", maker:" + maker);	
	}
}
