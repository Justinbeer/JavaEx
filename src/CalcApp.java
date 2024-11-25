

import java.util.Scanner;

// Command 패턴과 유사한
public class CalcApp {
	
	public static void main(String[] args) {
		// 스캐너에서 한줄 입력 공백 구분자로 분할
		// 첫번째 토큰 -> 숫자1
		// 두번째 토큰 -> 연산자기호
		//세번째 토큰 -> 숫자2
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			// 한줄 입력
			System.out.println(">> ");
			String line = scanner.nextLine();
			
			if (line.equals("/q")) {
				System.out.println("종료 합니다.");
				break;
			}
			
			String tokens[] = line.split(" ");
			int leftNum = Integer.valueOf(tokens[0]);
			int rightNum = Integer.valueOf(tokens[2]);
			String operator = tokens[1];
			
/*			System.out.println("Num1 : " + leftNum);
			System.out.println("연산자 : " + operator);
			System.out.println("Num2 : " + rightNum); */
			
			switch (operator) {
			case "+" : 
				Add add = new Add();
				add.setValue(leftNum, rightNum);
				System.out.println(">> " + add.calculate());
				break;
				
			case "-" : 
				Sub sub = new Sub();
				sub.setValue(leftNum, rightNum);
				System.out.println(">> " + sub.calculate());
				break;
				
			case "*" : 
				Mul mul = new Mul();
				mul.setValue(leftNum, rightNum);
				System.out.println(">> " + mul.calculate());
				break;
				
			case "/" : 
				Div div = new Div();
				div.setValue(leftNum, rightNum);
				System.out.println(">> " + div.calculate());
				break;
			
			default :
				System.out.println("알 수 없는 연산입니다.");
				
			}
			
		}

		scanner.close();
		
	}

}
