package UITests;

import java.util.Arrays;

public class Vivaa {

	public static void main(String[] args) {
// largest common pre-fix 
		String str[]= {"flower", "flow","flight", "flag", "fl"}; 
		System.out.println(longestPrefix(str));
		
		}
				 
	public static String longestPrefix(String[] str) {
		Arrays.sort(str);
		String st1 = str[0];
		String st2 = str[str.length-1];
		int index =0;
		
		while(index< st1.length()&& st1.charAt(index)==st2.charAt(index)) {
			
			index++;
		}
		
		
		
		return index ==0 ? " ":st1.substring(0, index); 
	}
	

}
