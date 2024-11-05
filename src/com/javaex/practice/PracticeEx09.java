package com.javaex.practice;

import java.util.Scanner;

public class PracticeEx09 {

	public static void main(String[] args) {
		// 태어난 년도를 입력받습니다.
		// 나이는 생일과 관계없이 계산됩니다. ex) 올해 2024년, 2020년생 (2024 - 2020 = 4)
		// 15세 미만의 경우와 65세 이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다." 메세지를 출력합니다.
		// 이외의 경우에는 "(나이)살 무료예방접종 대상자가 아닙니다." 메세지를 출력합니다.

		int num = 2024;
		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해주세요.");
		System.out.print("년도 : ");
		int year = scanner.nextInt();
		int age = (num - year);

		if (age < 15 || age >= 65) {
			System.out.println(age + "살 무료예방접종 대상자 입니다.");
		} else {
			System.out.println(age + "살 무료예방접종 대상자가 아닙니다.");
		} 
		scanner.close();
	}

}
