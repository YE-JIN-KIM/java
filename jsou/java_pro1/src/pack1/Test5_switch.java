package pack1;

import java.util.Scanner;

public class Test5_switch {

	public static void main(String[] args) {
		// 제어문 중 조건판단문 : switch - 조건판단문의 좀 더 정형화된 값에 따라 여러 방향으로 분기하는 경우 사용
		// 길게 늘어진 if문에 비해 코드가 짧고 의미파악이 쉽다.
		int nai = 22;
		nai = nai / 10 * 10;
//		System.out.println(nai);
		
		switch(nai) {
		case 20:
		case 30:
			System.out.println("이삼십대");
			break;
		case 40:
			System.out.println("사십대");
			break;
		default:
			System.out.println("기타");
			break;
		}
		
		System.out.println();
		
		String jik = "과장";
		switch(jik) {
			case "대리":
				System.out.println("대리야!");
				break;
			case "과장":
				System.out.println("과장 만세!");
				break;
		}
		
		System.out.println();
		double su1 = 10.0;
		double su2 = 3.5;
		char op = '/';
		double result = 0.0;
		
		switch(op) {
		case '+':
			result = su1 + su2;
			break;
		case '-':
			result = su1 - su2;
			break;
		case '*':
			result = su1 * su2;
			break;
		case '/':
			if(su2 == 0.0) {
				System.out.println("0으로 나누면 안돼");
				return;  //method를 탈출하는 명령
			}
			result = su1 / su2;
			break;
		}
		System.out.println("연산 결과는 " + result);  //2.857142857142857
		
		//참고용
		System.out.printf("연산 결과는 %f", + result); //2.857143 (printf) 소수 6번째 자리까지
		System.out.println();
		System.out.printf("%.2f\n", result);  // 소수 2번째 자리까지
		System.out.printf("%03d", (int)result); //정수 (구글 프린트f 출력물 검색)
		
		System.out.println();
		// 키보드로 부터 년과 월을 받아 해당 년 월 날수 출력
		// 출력 예)2023년 7월은 31일 평년
		// 윤년 체크 : 4의 배수이고 100의 배수가 아니거나 400의 배수이면 윤년
		int year, month, days = 28;
		String msg = "평년";
		Scanner scanner = new Scanner(System.in);
		System.out.print("년 입력: ");
		year = scanner.nextInt();
		System.out.print("월 입력: ");
		month = scanner.nextInt();
		if(month < 1 || month > 12) {
			System.out.println("월은 1~12 사이만 허용");
			System.exit(0);  //프로그램 강제 종료
		}
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			days = 29;
			msg = "윤년";
		}
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				break;
		}
		System.out.println(year + "년 " + month + "월은 " + days + " " + msg);
		
	}

}
