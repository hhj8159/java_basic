package lesson06_array;

import java.util.Scanner;

public class Exer240903 {
	public static void main(String[] args) {
		// 1. 모두의 마블
		// 주사위 두개를 굴려서 이동한 거리를 계산
		// 더블일 경우 한 번 더 굴린다, 총 이동 거리를 출력
		
		
		
		int sum = 0;
		int dice1 = 0;
		int dice2 = 0;
		do {
			dice1 = (int)(Math.random() * 6) + 1; // 굴림
			dice2 = (int)(Math.random() * 6) + 1;
			
			sum += dice1 + dice2;
			System.out.println(dice1);
			System.out.println(dice2);
		}
		while(dice1 == dice2);
		System.out.println(sum);
		
		
//		for(;;) {
//			int dice1 = (int)(Math.random() * 6) + 1; // 굴림
//			int dice2 = (int)(Math.random() * 6) + 1;
//			
//			sum += dice1 + dice2;
//			System.out.println(dice1);
//			System.out.println(dice2);
//			if(dice1 != dice2) {
//				break;
//			}
//			
//		}
//		System.out.println(sum);
//				
		
		// 2. 두 수를 입력받아(정수) 두 숫자 사이의 정수의 합 
		// ex) 3, 10 : 3+4+5+6+7+8+9+10 // 10, 3 : 3+4+5+6+7+8+9+10
		
		int sum1 = 0;
		int a = 0 , b = 0;
		sum1 = a + b;
		System.out.println(sum1);
		
		
		
		// 3. 최대 두개 입력, 최대 공약수 구하기
		// 12 18 >> 6
		// 12 : 1,2,3,4,6,12
		// 18 : 1,2,3,6,9,18
		// 두 수의 공약수 1,2,3,6
		
		// 4. 소수 여부 확인
		// 소수의 조건 : 약수가 1과 자신만 존재
		// ex) 10 소수가 아닙니다
		
		// 5. 회문수 구하기
		// 123321 : 회문수가 맞음 (숫자를 뒤집어도 원래 숫자와 같다)
		// 12345 : 회문수가 아님
		
	}
}
