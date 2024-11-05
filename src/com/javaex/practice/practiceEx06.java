package com.javaex.practice;

import java.util.Scanner;

public class practiceEx06 {

	public static void main(String[] args) {
		// 나이를 입력받아 19세 이상 65세 미만이면 1번그룹 그외에는 2번그룹으로 출력하는 프로그램을 작성하시오.
		
		System.out.println("나이를 입력하세요.");
		System.out.print("나이 : ");
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		String result;
		result = (age >= 19 && age < 65) ? "1번 그룹" : "2번 그룹";
		
		System.out.println(age + "세는 " + result + " 입니다.");
		
		scanner.close();
	}
	
	
	
}
