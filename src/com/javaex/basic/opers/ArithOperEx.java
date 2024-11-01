package com.javaex.basic.opers;

public class ArithOperEx {

	public static void main(String[] args) {
		
		/* arithBasic(); */
		incrOpers();
	}
	
	private static void incrOpers() {
		// 증감 연산자 (1항 연산)
		// ++, --
		// 앞에붙으면 : 전위증감
		// 뒤에붙으면 : 후위증감
		int a = 7;
		System.out.println("전위 증감");
		System.out.println("a : " + a);
		System.out.println("++a : " + ++a);
		System.out.println("Final a : " + a);
		
		System.out.println();
		a = 7; // 원상복구
		System.out.println("후위 증감");
		System.out.println("a : " + a);
		System.out.println("a++ : " + a++);
		System.out.println("Final a : " + a);
	}
	

	private static void arithBasic() {
		// 기초 산술연산자
		int a = 7, b = 3;
		
		System.out.println(a + b); // 덧셈
		System.out.println(a - b); // 뺄셈
		System.out.println(a * b); // 곱셈
		System.out.println(a / b); //나눗셈
		
		// int / int -> int
		System.out.println(a % b); // 나머지
		
		// 정수끼리의 나눗셈을 실수로 얻고자 한다면
		// 캐스팅
		
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b);
		
		
		
		
	}
	
}
