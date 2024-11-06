package com.javaex.oop.goods.v2;

// Goods v2. 접근제한자 
class Goods {
	// 필드선언 -> private
	private String name; 
	private int price;
}


// Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		Goods gram = new Goods();
		Goods cup = new Goods();
		
		// 생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		
		camera.name = "Nikon";
		camera.price = 400_000;
		
		gram.name = "LG그램";
		gram.price = 900_000;
		
		cup.name = "머그컵";
		cup.price = 2_000;
		
		System.out.printf("%s -> %, d%n", camera.name, camera.price);
		System.out.printf("%s -> %, d%n", gram.name, gram.price);
		System.out.printf("%s -> %, d%n", cup.name, cup.price);
		
	}

}
