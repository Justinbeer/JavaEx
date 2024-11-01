package com.javaex;

import java.util.Scanner;



// Console 
// 표준 입력 : stdin -> System.in
// 표준 출력 : stdout -> System.out
// 표춘 에러 : stderr -> System.err
public class consoleEx {

	public static void main(String[] args) {
		/* consoleOutput(); */
		consoleInput();
		
	}
	// 콘솔 입력예제
	public static void consoleInput () {
		// 표준 입력 : stdin -> System.in
		// 데이터 소스로부터 입력을 받는 Scanner 클래스를 사용
		
		// java.lang 이외의 기능을 불러올때는 import 필요
		Scanner scanner = new Scanner(System.in);
		
		// 이름과 나이를 물어봐서 출력하는 프로그램
		System.out.println("너 누구야 ? ");
		String name = scanner.next();
		System.out.println("나이는 몇 살이야 ?");
		int age = scanner.nextInt();
		
		System.out.println("Welcome, " + name);
		System.out.println("당신의 나이는 " + age + "세입니다.");
		
		// 시스템 자원은 다 쓰고 돌려줘야 한다
		scanner.close();
		
		
	}
	
	// 콘솔 출력 예제
	public static void consoleOutput() {
		// print : 개행 안함
		// println : 개행 함
		// print : 형식 지정 문자열
		System.out.print("Hello "); // 개행 안함
		System.out.println("Java!"); // 개행 함
		
		// 이스케이프 문자
		System.out.println("Hello\n\n\nJava"); // |n: 개행
		System.out.println("Hello\t\t\t\tJava"); // |t: 탭
		
		System.out.println("\\ : 역슬레시");
		
		
	}
	
}
