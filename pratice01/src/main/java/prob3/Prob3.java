package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력해 주세요 : ");
		Integer inputed_value =scanner.nextInt();
		
		if(inputed_value%2==0) {
			System.out.println("짝수 입니다.");
			System.out.println(evenNumber(inputed_value));
		}else if(inputed_value%2!=0){
			System.out.println("짝수 입니다.");
			System.out.println(oddNumber(inputed_value));
		}

		
		scanner.close();
	}
	
	
	public static Integer oddNumber(Integer a) {
		Integer sum = 0;
		for(int i=0; i<=a;i++){
			if(i%2 != 0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static Integer evenNumber(Integer a) {
		Integer sum = 0;
		for(int i=0; i<=a;i++){
			if(i%2 == 0) {
				sum+=i;
			}
		}
		return sum;
	}
}
