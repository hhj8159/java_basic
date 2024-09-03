package lesson5_control;

import java.util.Scanner;

// +-*/%
public class Test240902 {
	public static void main(String[] args) {
		
		//page111 test01
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				sum += i;	
			}
		}
//		for (int i = 0; i <= 100; i+=5) {
//				sum += i;			
//		}
		System.out.println("5의 배수 합계는 " + sum);
		
		//page111 test02
		int evenSum = 0;
		int oddSum = 0;
		//for문을 이용하여 반복 합계 연산
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("짝수의 합계는 " + evenSum);
		System.out.println("홀수의 합계는 " + oddSum);
		
		//page112 test03
		for (int x = 1; x <= 6; x++) {
			for (int y = 1; y <= 6; y++) {
				if(x + y == 6) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
		
		for(int i = 0 ; i < 5; i++ ) {
			for(int j = 0 ; j < 5; j++ ) {
				if(i + j <=4) {
					System.out.printf("(%d, %d)", i, j);
				}
			}
			System.out.println("");
		}
		
		
		for(int i = -2 ; i < 3; i++ ) {
			for(int j = -2 ; j < 3; j++ ) {
				if(i * j >= -1 && i * j <= 1) {
//					System.out.printf("(%2d, %2d)", i, j);
					System.out.print("*");
				}
				else {
//					System.out.printf("%7c", ' ');
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
		boolean exit = false;
		int cnt = 0;
		while(!exit) {
			int val = (int)(Math.random() * 6 + 1);
			System.out.println("("+val+")");
			cnt++;
			if(val == 6 ) {
				exit = true;
			}
		}
		System.out.println(cnt + "회");
			
		// 약수 배수 공약수 공배수 최대공약수 최소공배수
		// 소수(prime number) : 약수 구하기
		// 2, 3, 5, 7, 
		
		
	}
}
