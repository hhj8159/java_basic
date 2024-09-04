package lesson06_array;

import java.util.Scanner;

public class Exer240903 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1. 모두의 마블
		// 주사위 두개를 굴려서 이동한 거리를 계산
		// 더블일 경우 한 번 더 굴린다, 총 이동 거리를 출력
		
		// 1. 풀이
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
		
		// 2. 풀이
		int num1 = 10;
		int num2 = 3;
		int sum2 = 0;
		// num1의 값이  num2의 값을 넘지 못하도록 작은수로 고정하면 됨
		if(num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(int i = num1 ; i <= num2 ; i++) {
			
		}
		System.out.println(sum2);
	
//		int sum1 = 0;
//		System.out.print("두가지 정수 입력 > ");
//		int a = scanner.nextInt();		
//		int b = scanner.nextInt();
//		//int a = 3 , b = 10;
//		// i = 1 ; i <= 10  1, 10에 숫자 대신 뭘 넣어야할지 모르겠음
//		for(int i = 1 ; i <= 100 ; i++) {
//			if(a <= i && b >= i) {
//				sum1 += i; 
//				
//				}
//			else if(a >= i && b <= i) {
//					sum1 += i;
//			}
//		}		
//		System.out.println(sum1);
		
		
		
		// 3. 최대 두개 입력, 최대 공약수 구하기
		// 12 18 >> 6
		// 12 : 1,2,3,4,6,12
		// 18 : 1,2,3,6,9,18
		// 두 수의 공약수 1,2,3,6
		
		// 3. 풀이
		
		
		
		// 145 15 10
		//     15 10 5
		//        10 5 0
		
		// 1 1 2 3 5 8 13
		// 1 1 2
		//   1 2 3
		//     2 3 5
		
		num1 = 12;
		num2 = 18;
		int result = 0;
		for(int i = 1 ; i <= num1 ; i++) {
			for(int j = 1 ; j <= num2 ; j++) {
				if(num1 % i == 0 && num2 % j == 0 && i == j) {
//					System.out.println(j);
					result = i;
				}
			}
		}
		System.out.println(result);
		//System.out.printf("%d : %d", i, num1 % i);
		
		
		// 12 18 12
		//	  18 12 6
		//       12 6 0
		boolean flag = true;
		while(flag) {
			int tmp = num1 % num2;
			num1 = num2;
			tmp = num2;
			//System.out.printf("%d %d %d\n", num1, num2, tmp );
			if(tmp == 0) {
				flag = false;
				System.out.println(num1);
			}
		}
		//System.out.println(result);
		
		// gcd최대공약수 lcm최소공배수
		// greater common dividor
		// a * b / gcd
		
		// 12 24 36 48 60
		// 18 36 54 72 90
		// 36 72 108
		
		// 12 * 18 / 6
		System.out.println(12 * 18 / 6);
		
		// 7 8
		num1 = 12;
		num2 = 18;
		System.out.println("================");
		for(int i = num1 ; i <= num1 * num2 ; i += num1) {
			System.out.println(i);
		}
		for(int j = num2 ; j <= num1 * num2 ; j += num2) {
			System.out.println(j);
		}
		
		// 4. 소수 여부 확인
		// 소수의 조건 : 약수가 1과 자신만 존재
		// ex) 10 소수가 아닙니다
		
		int num = 10;
		flag = true;
		for(int i = 2 ; i < num ; i++) {
			if(num % 1 == 0) {
				flag = false;
				break;
			}
		}
		System.out.println(num + "은 " + (flag ? "소수" : "소수아님"));
		

		
		// 5. 회문수 구하기
		// 123321 : 회문수가 맞음 (숫자를 뒤집어도 원래 숫자와 같다)
		// 12345 : 회문수가 아님
		num = 12345; // 54321
		result = 0;
		int tmp = num;
		
		while(tmp != 0) {
//			System.out.println(tmp);
//			System.out.println(tmp % 10);
			result = result * 10 + tmp % 10;
			tmp /= 10;			
		}		
		System.out.println(result);
		
	}


}