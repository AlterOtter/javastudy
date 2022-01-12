package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print("값을 입력해 주세요 : ");
		Integer inputed_value =scanner.nextInt();
		if(inputed_value != null) {
			if(inputed_value%3 ==0) {
				System.out.println("3의 배수 입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}		
		}else {
			System.out.println("값을 입력 하세요");
		}
	
		
		scanner.close();
	}
}
