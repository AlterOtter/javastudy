package prob04;

import java.util.Arrays;

public class StringUtil {
	public static String concatenate(String ...str) {
		String temp_str = "";
		for(String c:str) {
			temp_str+=c;
		}
		
		return temp_str;
	}
}
