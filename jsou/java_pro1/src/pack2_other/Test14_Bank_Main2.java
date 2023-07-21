package pack2_other;

import pack2.Test14_Bank;   // 다른 package의 클래스를 사용하려면 import (같은 프로젝트만 가능 프로젝트 다르면 다른 방법 찾기)
import pack2.*;  // package 내부에있는 다른것도 사용가능함 - * (좋은방법 아님 메모리 낭비 됨)

public class Test14_Bank_Main2 {
	//Test14_Bank와 Test14_Bank_Main은 다른 package에 존재
	public static void main(String[] args) {
		System.out.println("뭔가를 하다가///");
		
		Test14_Bank john = new Test14_Bank();
		System.out.println("john의 예금액" + john.getMoney());
		
		System.out.println();
		// 접근 지정자 영향 범위 확인
		//System.out.println("Bank의 private member : " + john.Money);
		System.out.println("Bank의 public member : " + john.imsi2);
	}

}
