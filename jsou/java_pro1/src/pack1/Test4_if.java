package pack1;

import java.util.Scanner;

public class Test4_if {

	public static void main(String[] args) {
		// 제어문 중 조건판단문 : if
		int num =5;
		
		if(num >= 3) {  // {}블럭화
			System.out.println("크군요");
			System.out.println("와우!");
			int su = 10;
			System.out.println("블럭 내의 su(지역 변수) :"  + su);
		}
		
		if(num >= 8) {
			System.out.println("참일 때");
		}else {
			System.out.println("거짓일 때");
			System.out.println("거짓일 때2");
		}
		
		System.out.println("\n다중 if---");
		
		// 키보드로 자료 입력 받기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String irum = sc.next();
		System.out.println("이름은 " + irum);		
		System.out.print("점수 입력 : ");
		int jumsu = sc.nextInt();
		*/
		
		int jumsu = 50;
		
		if(jumsu >= 70) {
			
			if(jumsu >= 90 ) {
				System.out.println("수");
			}else {
				System.out.println("보통");				
			}
		}else {
			if(jumsu >= 50) {
				System.out.println("\n저조");
			}else {
				System.out.println("엄청 저조");
			}
		}
		
		jumsu = 75;
		String msg = "";
		if(jumsu >= 90) {
			msg = "수";
		}else if(jumsu >= 80) {
			msg = "우";
		}else if(jumsu >= 70) {
			msg = "미";
		}else if(jumsu >= 60) {
			msg = "양";
		}else {
			msg = "가";
		}
		System.out.println("결과는 " + msg);
		
		
		// 8세 이하 65세 이상은 입장료 무료
		// 9세 이상 20세 미만은 3000원
		// 20세 이상 65세 미만은 5000원
		int age = 66;
		if(8 >= age || age >= 65) {
			System.out.println("무료");
		}else if(9 <= age && age < 20) {
			System.out.println("3000원");
		}else if(20 <= age && age < 65) {
			System.out.println("5000원");
		}
		
		int total = 0;  //최종 금액
		if(9 <= age && age < 20) {
			total = 3000;
		}else if(20 <= age && age < 65) {
			total = 5000;
		}
		System.out.println("입장료는 " + total + "원");
		
		System.out.println();
		
		//문제
		//키보드로 상품명, 수량, 단가를 입력받아 아래와 같이 출력
		//금액 = 수량 * 단가
		//금액이 5만원 이상이면 금액의 10%를 세금으로 징수
		//금액이 5만원 미만이면 금액의 5%를 세금으로 징수
		//출력 --> 상품명:*** 금액:*** 세금:*** 최종액:***
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 입력 : ");
		String name = sc.next();		
		System.out.print("수량 입력 : ");
		int ea = sc.nextInt();
		System.out.print("단가 입력 : ");
		int cost = sc.nextInt();
		
		int price = cost * ea;
		
		double tex = 0.0;
		if(50000 <= price) {
			tex = price * 0.1;
		}else {
			tex = price * 0.05;
		}		
		double price2 = price-tex;
	
		System.out.println("\n상품명 : " + name + "\n금액 : " + price + "\n세금 : " + tex + "\n최종액 : " + price2);
		
		
		
		System.out.println("\n프로그램 종료");
	}

}
