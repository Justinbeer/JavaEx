package com.javaex.practice;

import java.util.Scanner;

public class practiceEx10 {

	public static void main(String[] args) {
		// 두개의 숫자를 입력받아 큰수와 작은수를 분류하여 출력하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요.");
		System.out.print("숫자 1 : ");
		int num1 = scanner.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = scanner.nextInt();
		
		int result = (num1 - num2);
		
		if (result >= 0 ) {
			System.out.println("큰수 : " + num1 + "\n" + "작은수 : " + num2 );
		} else {
			System.out.println("큰수 : " + num2 + "\n" + "작은수 : " + num1 );
		}
		scanner.close();
	}

}
