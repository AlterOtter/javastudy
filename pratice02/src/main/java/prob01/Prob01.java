package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int money_50000=0;
		int money_10000=0;
		int money_1000=0;
		int money_500 =0;
		int money_50=0;
		int money_10=0;
		int money_5=0;
		int money_1=0;
		
		Integer inputValue = scanner.nextInt();
		money_50000= inputValue/50000;
		Integer rest = inputValue%50000;
		money_10000= rest/10000;
		rest = rest%10000;
		money_1000= rest/1000;
		rest = rest%1000;
		money_500 = rest/500;
		rest = rest%500;
		money_50 = rest/50;
		rest=rest%50;
		money_10 = rest/10;
		rest=rest%10;
		money_5 = rest/5;
		rest=rest%5;
		money_1 = rest;
		
		System.out.println("5만원 :"+money_50000+" 1만원:"+money_10000+" 1천원:"+money_1000+", 500원:"+money_500+", 50원:"+money_50+", 10원:"+money_10+", 5원: "+money_5+", 1원:"+money_1);
		/* 코드 작성 */
		
		scanner.close();
 	}
}