package com.javaex.practice04;

import java.util.HashSet;
import java.util.Set;

public class Practice08 {

	public static void main(String[] args) {
		// 배열을 사용하여 1~45까지의 숫자중 임의의 6개 숫자를 출력하세요 - 미니로또
		
		 Set<Integer> lottoNumbers = new HashSet<>(); // 중복을 자동으로 처리해주는 Set

	        while (lottoNumbers.size() < 6) { // 6개의 번호를 만들 때까지 반복
	            int number = (int) (Math.random() * 45) + 1; // 1~45 사이의 랜덤 숫자 생성
	            lottoNumbers.add(number); // 중복되는 숫자는 자동으로 추가되지 않음
	        }

	        // Set의 각 번호를 출력
	        for (int num : lottoNumbers) {
	            System.out.print(num + "\t");
	        }
	        System.out.println(); // 줄바꿈
	}

}
