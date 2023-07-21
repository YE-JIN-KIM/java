package pack4;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test40ListTest {

	public static void main(String[] args) {
		// List type : 순서가 있고 중복을 허용
		//List<String> list = new ArrayList<String>(); 위아래 둘다 사용가능  위:치환 아래 : 프로모션
		ArrayList<String> list = new ArrayList<String>(); 
		//Vector<String> list = new Vector<String>(); 예전 방식 기억만 하고 ArrayList 사용
		list.add("kor");
		list.add("eng");
		list.add("mat");
		list.add("kor");
		System.out.println(list.size());
		System.out.println(list);
		list.remove("kor");
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println();
		for(Object a:list) {
			System.out.println(a);
		}
	}

}
