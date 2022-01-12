package prob5;

public class Prob5 {

	public static void main(String[] args) {
		for(Integer i=0;i<100;i++) {
			char[] charlist=i.toString().toCharArray();
			int count =0;
			for(char c:charlist) {
				if((c=='3')||(c=='6')||(c=='9')) {
					count++;
				}
			}
			if(count != 0) {
				System.out.println();
				System.out.print(i+" : ");
			}
			for(int j=0;j<count;j++) {
				System.out.print("짝");
			}
			
			
		}
	}
}
