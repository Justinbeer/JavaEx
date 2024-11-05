package com.javaex.practice;

import java.util.Scanner;

public class practiceEx08 {

	public static void main(String[] args) {
		// 사용자로 키와 몸무게를 받아 BMI를 계산한 후에 저체중, 정상체중, 과체중 을 구분하여 출력하는 프로그램을 만드시오.(정상체중의 범위는 18.5 <= BMI <= 24.9)
		
		System.out.println("키와 몸무게를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("키 : ");
		double height = scanner.nextInt();
		System.out.print("몸무게 : ");
		double weight = scanner.nextInt();
		
		double bmi = (weight / ((height / 100)* (height / 100)));
		
		
		
		if (bmi < 18.5) {
			System.out.println("저체중");
			System.out.println("BMI : " + bmi);
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("정상체중");
			System.out.println("BMI : " + bmi);
		} else {
			System.out.println("과체중");
			System.out.println("BMI : " + bmi);
		}
		scanner.close();
	}

}
