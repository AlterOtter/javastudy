package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		// 상품 입력
		for(int i=0;i<COUNT_GOODS;i++) {
			System.out.print("이름을 입력해 주세요 : ");
			String name = scanner.next();
			System.out.print("가격을 입력해 주세요 : ");
			Integer price = scanner.nextInt();
			System.out.print("갯수를 입력해 주세요 : ");
			Integer num = scanner.nextInt();
			goods[i]=new Goods(name,num,price);
		}
		// 상품 출
		for(Goods go:goods) {
			System.out.println(go.toString()); 
		}
		
		// 자원정리
		scanner.close();
	}
}
