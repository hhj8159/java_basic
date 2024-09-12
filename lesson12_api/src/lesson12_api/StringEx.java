package lesson12_api;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
//		String 클래스 메서드
		
		
		String str = "abcdeabcde";
		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(100));
//		System.out.println(str.charAt(-3));
		
		System.out.println(str.equals(new String("abcdeabcde")));
		
		System.out.println(str.indexOf("b"));
		System.out.println(str.indexOf("b", 3));
		System.out.println(str.lastIndexOf("b", 3));
		System.out.println(str.lastIndexOf("b"));
		
//		substring
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		
//		첫번째 만나는  "c"문자열에서 마지막 만나는 "d"문자열까지 자르기
		;
		
		System.out.println(str.subSequence(str.indexOf("c"), str.lastIndexOf("d")));
		
		System.out.println(str.toUpperCase().toLowerCase());
		
		String s = "   [ 안녕하세요 ]   ";
		System.out.println(s.trim().replaceAll(" ", ""));
		
		System.out.println(str.endsWith("de"));
		System.out.println(str.endsWith("cd"));
		System.out.println(str.indexOf("cdea "));
		
		System.out.println(str.replace("a", "f"));
		System.out.println(str.replaceFirst("a", "f")); // First 처음 만난 a만 f로 변환하게 만들어줌
		
		System.out.println(Arrays.toString(str.split("")));
		System.out.println(Arrays.toString(str.split("b")));
		
		System.out.println("abc".compareTo("abc"));
		System.out.println("abc".compareTo("aze"));
		System.out.println("abc".compareTo("aae"));// 양수인지 음수인지 0인지
		
		
		
		
		
		
	}
}
