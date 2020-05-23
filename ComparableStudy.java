package kr.hs.dgsw.c1.d0512;

import java.util.Date;

public class ComparableStudy {

	public static void main(String[] args) {
	
		String str1 = "Hello World";
		String str2 = "Good Morning";
		String str3 = "Zoo";
		String str4 = "Hello World";
		
		int result2= str1.compareTo(str2);
		int result3= str1.compareTo(str3);
		int result4 = str1.compareTo(str4);
		
		System.out.println("result : " + result2 + " " + result3 + " " + result4);
		
		Date date1 = new Date(1000000);
		Date date2 = new Date(1000001);
		
		System.out.println(date1.compareTo(date2) + " " + date2.compareTo(date1));
	}
	
}
