package com.javaex.practice;

import java.util.Scanner;

public class practiceEx07 {

	public static void main(String[] args) {
		// 나이를 입력받아	 아래와같이 입장료가 출력되도록 프로그램을 작성하시오.
		// 0~7세 취학전아동/무료 입니다.
		// 8~13세 초등학생/2,000원 입니다.
		// 14~16세 중학생/3,000원 입니다.
		// 17~19세 고등학생/4,000원 입니다.
		// 20세~ 성인/5,000원 입니다.

		
		System.out.println("나이를 입력하세요");
		System.out.print("나이 : ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if (age <= 7){
			System.out.println("취학전아동/무료 입니다.");
		} else if (age >= 8 && age <= 13) {
			System.out.println("초등학생/2,000원 입니다.");
		} else if (age >= 14 && age <= 16) {
			System.out.println("중학생/3,000원 입니다.");
		} else if (age >= 17 && age <= 19) {
			System.out.println("고등학생/4,000원 입니다.");
		} else {
			System.out.println("성인/5,000원 입니다.");
		}
		
		scanner.close();
		
		
		
	}

}
