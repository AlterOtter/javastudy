package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		System.out.println("받은 문자열 : "+str);
		char[] strarr = str.toCharArray();
		int length = strarr.length;
		char[] temparr= new char[length];
		System.out.println("입력된 문자열의 길이:"+length);
		for(int i=0;i<length;i++) {
			temparr[length-i-1]=strarr[i];
		}
 		return temparr;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println(String.valueOf(array));
	}
}