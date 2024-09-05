package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
				
		//1. 지폐, 동전 세기
		int money = 123456;
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] counts = new int[10];
		// {2,2,0,3,0,4,1,0,1,1}
		
//		System.out.println(money / unit[0]);
//		money %= unit[0];
//		
//		int	count = 0;
//		int money1 = 123456;
//		int unit1 = 50000;
//		count = money1 / unit1;
//		money1 %= unit1;
//		System.out.printf("%d %d", count, money1);
	  
		// 1. 풀이
		for(int i = 0; i < unit.length; i++) {
			counts[i] = money / unit[i];
			money %= unit[i];
		}
		for(int i = 0; i < unit.length; i++) {
			System.out.printf("%d원 %d" + (unit[i] >= 1000 ? "장" : "개") + "\n"
				, unit[i], counts[i]);
		}		
		System.out.println();

		
		// 2. Scanner 사용하여 사람 이름을 입력 받기
		// 입력 글자중 q를 입력하면 입력 종료
		// 사람 이름들을 문자열 배열 만들어서
		// 프로그램 종료 직전 확인		

		// 2. 풀이
		Scanner scanner = new Scanner(System.in);
		String[] strings = new String[3];
		
		for(int i = 0;; i++) {
			System.out.print("이름 입력 >");
			String str = scanner.nextLine();
			if(str.equals("q")) {
				System.out.println("bye");
				break;
			}
			
			// 배열 늘리기
			if(strings.length == i) {
				System.out.println("문제 발생 직전");
				strings = Arrays.copyOf(strings, strings.length * 2); //"문제 발생 직전에 도달시 배열을 *2씩 늘림
			}
			strings[i] = str;
		}
		
		for(String s : strings) {
			if(s != null) break; // null 출력 지우기
			System.out.println(s);
		}
		
		
		// null 지우는 다른 예시
//		for(int i = 0;; i++) {
//			System.out.print("이름 입력 >");
//			String str = scanner.nextLine();
//			if(str.equals("q")) {
//				System.out.println("bye");
//				strings = Arrays.copyOf(strings, i);
//				break;
//			}
//			
//			// 배열 늘리기
//			if(strings.length == i) {
//				System.out.println("문제 발생 직전");
//				strings = Arrays.copyOf(strings, strings.length * 2); //"문제 발생 직전에 도달시 배열을 *2씩 늘림
//			}
//			strings[i] = str;
//		}
//		
//		for(String s : strings) {
//			System.out.println(s);
//		}
		
		
//		while(true) {
//			String str = scanner.nextLine();
//			System.out.println(str);
//			if(str.equals("q")) {
//				System.out.println("bye");
//				break;
//			}
//		}
//		
//		for(String s : strings) {
//			System.out.println(s);
//		}
		
		
		
		// for(int i = 0;;i++) : for 무한반복
		
		
//		System.out.println("\n이름 입력");
		//String[] arr = {""};
//		while(true) {
			//for(int i = 0; i <= arr.length; i++) {
//				String name = scanner.nextLine();
				//arr[i] = name;
//				if(arr == "q"??? ) {
//					break;
//				}
//				System.out.println(Arrays.toString(arr));
			
		
			
	
		
	}
}
