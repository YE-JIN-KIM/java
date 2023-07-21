package pack4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Collection : 객체를 담을 수 있는 기억장소
// Set, List, Map 타입 ...
public class Test39SetTest {

	public static void main(String[] args) {
		// Set type : 중복 불가, 순서 없음
		// 참고 Collection클래스<Generic> : Generic은 컬렉션을 저장할 객체의 타입을 제한
		HashSet<String> list = new HashSet<String>();  // 다양한걸 다 받음 타입 상관없음 Object
		//list.add(1);
		list.add("kor");
		list.add("eng");
		list.add("mat");
		list.add("kor");
		System.out.println(list.size());
		System.out.println(list);
		list.remove("eng");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.toArray());
		System.out.println("-----------");
		print(list.toArray());
		System.out.println("-----------");
		print(list);
		
	}
	
	public static void print(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		for(Object ob:obj) {
			System.out.println(ob);
		}
	}
	
	public static void print(Set set) {
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String str = (String)iter.next();
			System.out.println(str);
		}
		
	}
	
}
