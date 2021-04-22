package p11.regex;

import java.util.regex.Pattern;

public class A01RegularExpression {
	public static void main(String[] args) {
		String regex1 = "";
		String str1 = "";
		
		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);
		
		regex1 = "java";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 ="9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 ="\\d";
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));
	}
}
