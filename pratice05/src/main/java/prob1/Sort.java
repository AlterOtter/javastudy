package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int count =  array.length;
		
		
		for(int i=0;i<count-1;i++) {
			for(int j=0;j<count-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]= array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		System.out.println( "Before sort." );
		
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		for(int i=0;i<count-1;i++) {
			for(int j=0;j<count-1;j++) {
				if(array[j]<=array[j+1]) {
					int temp = array[j];
					array[j]= array[j+1];
					array[j+1] = temp;
				}
			}
		}	

		
		// 결과 출력
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}		
	}
}