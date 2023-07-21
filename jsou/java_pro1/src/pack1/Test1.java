package pack1;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("성공");
		// 한줄 주석
		/*
		여러 줄
		주석
		 */
		System.out.println("단축키를 추천");
		System.out.print("자바");
		System.out.print("만\n세\n"); //이스케이프문자 라인스킵
		System.out.println("자바 만세");
		// print println 차이점 
		
		// 기본형 변수(값(데이터,리터럴)을 기억하고자 기억장소를 확보하고 기억장소에 이름을 부여)
		// 자바는 정수의 경우 int type(4byte)이 기본
		// 자바는 실수의 경우 double type(8byte)이 기본
		
		// bcbsilfd
		byte var1; // 형식 : 참조형(type) 변수명. 1byte 기억장소 -128 ~ 127까지 정수 기억
		var1 = 5;
		var1 = 8;
		// var1 = 3.5; 실수인 경우 1바이트 안에 안됨
		var1 = 127;
		System.out.println("var1 : " + var1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);		
		System.out.println();
		
		short var2 = 23;  // 2byte 기억장소 -32768 ~32767까지 정수 기억
		var2 = 32767;
		System.out.println("var2 : " + var2);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);	
		System.out.println();
		
		// 변수명은 영문소문자, _, 한글(비권장)로
		int var3;  // 4byte 기억장소 -2147483648 ~2147483647까지 정수 기억
		var3 = 5;
		var3 = 2147483647;
		System.out.println("var3 : " + var3);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println();
		
		long var4 =2;  // 8byte 기억장소 -9223372036854775808 ~9223372036854775807까지 정수 기억
		var4 = 2147483647L; // 정수L을 하면 long type의 데이터(값, 리터럴)
		var4 = 2L;
		System.out.println("var4 : " + var4);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println();
		System.out.println();
		
		double var5 = 2.3;  // 8byte 실수기억장소. 소숫점 18번쨰 자리에서 반올림
		System.out.println("var5 : " + var5);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println();
		
		float var6 = 2.3F;  // 4byte 실수기억장소. 소숫점 9번쨰 자리에서 반올림
		var6 = 4.5f;
		System.out.println("var6 : " + var6);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println();
		
		System.out.println("형 변환 : 자동(promotion), 강제(casting)");
		byte b1 = 12;  // promotion
		b1 = (byte)850;  // casting
		b1 = 123;
		byte b2 = b1;
		
		System.out.println("b1 : " + b1+" "+ b2);
		
		short s1 = 123;
		s1 = (short)56789;
		
		int aa = (int)123.4;  // 소수 이하 버림
		System.out.println("aa :" + aa);
		
		double bb = 123;
		float cc = (float)bb;  //45.6f
		System.out.println("bb : " + bb);
		
		System.out.println();
		double result = 4.5 * 10;  // 연산 시 큰 타입으로 자동 형변환 (더블과 인티저만나면 더블로 변환)
		System.out.println("result : " +result);
		
		//int result2 = (int)4.5 * 10;
		int result2 = (int)(4.5 * 10.2);
		System.out.println("result : " +result);
		
		System.out.println();
		boolean bu1 = true;   //논리형( 참 또는 거짓 결과를 기억)
		bu1 = false;
		System.out.println("bu1 :" + bu1);
		// System.out.println("bu1 :" + (int)bu1);   //X
		
		System.out.println();
		char c1 = 'a';  //'문자' 한 개만 허용
		//char c1 = "a"; // "문자열"을 char type에 저장 불가
		// c1 = 'abc';
		System.out.println("c1 :" + c1);
		System.out.println("c1 :" + (int)c1);
		System.out.println("c1 :" + (char)98);  //아스키코드
		
		System.out.println();
		
		//boolean , Double , Integer 많이쓰임
		
		System.out.println();
		//상수
		int kor = 90;  //변수 (기억장소 이름)
		kor = 80;      // 새로운 값으로 덮어쓰기 가능
		final int ENG = 100;  // 상수 (기억장소 이름)
//		ENG = 90;  덮어쓰기 불가능
		final double PI = 3.1415927;  // final을 앞에 적으면 덮어쓰기 불가능
		
	}
	
} 

