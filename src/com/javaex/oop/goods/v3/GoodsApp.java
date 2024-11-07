package com.javaex.oop.goods.v3;

// Goods v3. 생성자 
// 생성자가 만들어져 있지 않으면 JVM이 기본 생성자를 끼워 넣는다.
// 개발자가 생성자를 만들면 JVM은 기본 생성자를 끼워 넣지 않는다.
// Setter가 없으면 Read-Only
class Goods {
	// 필드
	private String name; 
	private int price;
	
	// 생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// Getters / Setters
	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name;
		// this -> 현재 인스턴트 자체
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.printf("가격 : %,d원%n", price);
	}
	
	
	
	
}


// Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();
		Goods camera = new Goods("Nikon", 40_000);
//		Goods gram = new Goods();
		Goods gram = new Goods("LG 그램", 900_000);
//		Goods cup = new Goods();
		Goods cup = new Goods("머그컵", 2_000);
		
//		gram.setPrice(1_000);
		
//		camera.setName("Nikon");
//		camera.setPrice(400_000);
		

//		gram.setName("LG그램");
//		gram.setPrice(900_000);
		
//		cup.name = "머그컵";
//		cup.price = 2_000;
//		cup.setName("머그컵");
//		cup.setPrice(2_000);
		
//		System.out.printf("%s -> %, d%n", camera.name, camera.price);
//		System.out.printf("%s -> %, d%n", gram.name, gram.price);
//		System.out.printf("%s -> %, d%n", cup.name, cup.price);
		
//		System.out.printf("%s -> %, d%n", camera.getName(), camera.getPrice());
//		System.out.printf("%s -> %, d%n", gram.getName(), gram.getPrice());
//		System.out.printf("%s -> %, d%n", cup.getName(), cup.getPrice());
		
		camera.showInfo();
		gram.showInfo();
		cup.showInfo();
		
	}

}
