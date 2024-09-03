package lesson06_array;

import java.util.Arrays;

public class Info2 {
	public static void main(String[] args) {
		int[] arr = new int[]{10, 5, 3, 8, 4};
		arr = new int[10];
		arr = new int[]{1, 2, 3};
		// arr.length
		System.out.println(arr.length);
		char[] cArr = {'A', 'B', '가', '나'};
		String[] strArr = {"가나", "다라"};
		System.out.println(arr);
		System.out.println(cArr);
		System.out.println(strArr);
		
		// 배열 내부의 값을 간편하게 확인하는 함수 : Arrays.toString(배열)
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(cArr));
		
//		int[] number = new int[100];
//		
//		//배열 변수에 대입
//		for (int i = 0 ; i < number.length ; i++) {
//			number[i] = i + 1;
//		}
//		//배열 변수 출력
//		for (int i = 0  ; i < number.length ; i++) {
//			System.out.println(number[i]);
//		}
		
		
		
		
	}
}
