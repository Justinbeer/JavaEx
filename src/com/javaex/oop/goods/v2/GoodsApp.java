package com.javaex.oop.goods.v2;

// Goods v2. 접근제한자 
class Goods {
	// 필드선언 -> private
	// 정보는 은닉하고 Getter와 Setter를 통한 우회 접근이 필요	
	private String name; 
	private int price;
	
	// Getters / Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		// this -> 현재 인스턴트 자체
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}


// Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		Goods gram = new Goods();
		Goods cup = new Goods();
		
		// 생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		
//		camera.name = "Nikon";
//		camera.price = 400_000;
		camera.setName("Nikon");
		camera.setPrice(400_000);
		
//		gram.name = "LG그램";
//		gram.price = 900_000;
		gram.setName("LG그램");
		gram.setPrice(900_000);
		
//		cup.name = "머그컵";
//		cup.price = 2_000;
		cup.setName("머그컵");
		cup.setPrice(2_000);
		
//		System.out.printf("%s -> %, d%n", camera.name, camera.price);
//		System.out.printf("%s -> %, d%n", gram.name, gram.price);
//		System.out.printf("%s -> %, d%n", cup.name, cup.price);
		System.out.printf("%s -> %, d%n", camera.getName(), camera.getPrice());
		System.out.printf("%s -> %, d%n", gram.getName(), gram.getPrice());
		System.out.printf("%s -> %, d%n", cup.getName(), cup.getPrice());
		
	}

}
