package pack3;

public class Test22Main {

	public static void main(String[] args) {
		Test22Student student = new Test22Student();		
		System.out.println(student.study());
		System.out.println(student.getName());
		System.out.println(student.getGrade());
		student.study();
		
		
		System.out.println();
		Test22Tom tom = new Test22Tom();
		System.out.println(tom.study());
		System.out.println(tom.spec());
		tom.spec();
		

		System.out.println();
		Test22James james = new Test22James();
		
	}

}
