package com.javaex.practice04;

public class Practice08 {

	public static void main(String[] args) {
		// 배열을 사용하여 1~45까지의 숫자중 임의의 6개 숫자를 출력하세요 - 미니로또
		
		for (int i = 0; i < 6; i++) {
//			System.out.print((int)(Math.random() * 45) + 1);
//			System.out.print("\t");
			for (int j = 0; j < i ; j++) {
				if( i == j) {
					i--;
					break;
				}
			}
			
//			if()
			
		}
		
		
	}
	
}
