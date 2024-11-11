package com.javaex.practice04;

import java.util.Arrays;
import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// 키보드에서 정수로 된 돈의 액수를 입력받아 50,000원권, 10,000원권, 5,000원권, 1,000원권, 500원 동전, 100원
		// 동전, 50원 동전, 1원 동전 각 몇개로 변환되는지 작성하시오.

		/*
		 * int[] wonArray = new int[10]; wonArray[0] = 50000; wonArray[1] = 10000;
		 * wonArray[2] = 5000; wonArray[3] = 1000; wonArray[4] = 500; wonArray[5] = 100;
		 * wonArray[6] = 50; wonArray[7] = 10; wonArray[8] = 5; wonArray[9] = 1;
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 입력: ");
		int totalAmount2 = scanner.nextInt();

		int totalAmount = totalAmount2; // 계산을 위한 변수 옮기기
		int fiftyThousand = totalAmount / 50000;
		totalAmount %= 50000;

		int tenThousand = totalAmount / 10000;
		totalAmount %= 10000;

		int fiveThousand = totalAmount / 5000;
		totalAmount %= 5000;

		int oneThousand = totalAmount / 1000;
		totalAmount %= 1000;

		int fiveHundred = totalAmount / 500;
		totalAmount %= 500;

		int oneHundred = totalAmount / 100;
		totalAmount %= 100;
		
		int fifty = totalAmount / 50;
		totalAmount %= 50;
		
		int ten = totalAmount / 10;
		totalAmount %= 10;
		
		int five = totalAmount / 5;
		totalAmount %= 5;
		
		int one = totalAmount / 1;
		totalAmount %= 1;

//		System.out.println("잔돈: " + totalAmount2 + "원");
		System.out.println("50,000원: " + fiftyThousand + "개");
		System.out.println("10,000원: " + tenThousand + "개");
		System.out.println("5,000원: " + fiveThousand + "개");
		System.out.println("1,000원: " + oneThousand + "개");
		System.out.println("500원: " + fiveHundred + "개");
		System.out.println("100원: " + oneHundred + "개");
		System.out.println("50원: " + fifty + "개");
		System.out.println("10원: " + ten + "개");
		System.out.println("5원: " + five + "개");
		System.out.println("1원: " + one + "개");
		
	}

}
