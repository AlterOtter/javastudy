package prob5;

public class Prob5 {

	public static void main(String[] args) {
		for(Integer i=0;i<100;i++) {
			char[] charlist=i.toString().toCharArray();
			x:for(char c:charlist) {
				if((c=='3')||(c=='6')||(c=='9')) {
					System.out.println(i+"짝짞");
					break x;
				}
			}
		}
	}
}
