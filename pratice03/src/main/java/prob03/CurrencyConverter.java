package prob03;

public class CurrencyConverter {
	private static double rate;

	public static double  toDollar(double won) {
	    
		return won/rate;
	}
	public static double  toKRW(double dollar) {
		return dollar*rate;
	      // 달러를 한국 원화로 변환
	}
	public static void setRate(double r) {
	      rate=r;
	}

}
