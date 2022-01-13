package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[ 5 ];
		double sum = 0;

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		for(int i=0; i<intArray.length;i++) {
			System.out.print("숫자를 입력해주세요");
			intArray[i]=scanner.nextInt();
		}
		/* 배열에 저장된 정수 값 더하기 */
		for(int num:intArray) {
			sum+=num;
		}
		/* 출력 */
		double avg = sum/intArray.length;
		System.out.println(avg);
		/* 자원정리 */
		scanner.close();
	}
}
