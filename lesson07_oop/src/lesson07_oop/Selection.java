package lesson07_oop;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		// 회차 반복문
		// 최소값 찾기 반복문 내부
		// - 최소값이 존재하는 인덱스
		// - 0번째 위치의 값이 위 인덱스에 있던 값과 교환
		
		// 1. 풀이
//		String str = "123456";
//		System.out.println(str.indexOf("3"));
//		System.out.println(str.indexOf('3'));
//		
//		char[] cs = str.toCharArray();
//		int idx = -1;
//		for (int i = 0; i < cs.length; i++) {
//			if(cs[i] == '3'); {
//				idx = i;
//				break;
//			}
//			
//		}
//		System.out.println(idx);
		
		int[] arr = {5,8,9,1,7};
		for(int i = 0; i <arr.length; i++) {
			int idx = i;
//			int min = arr[idx];
			for(int j = i; j < arr.length; j++) {
				if(arr[idx] > arr[j]) {
//					min = arr[j];
					idx = j;
				}
			}
//			System.out.println(idx);
			int tmp = arr[idx];
			arr[idx] = arr[i]; /// {5,4,2,5,7}
			arr[i] = tmp; // {1,4,2,5,7}
			System.out.println(Arrays.toString(arr));
		}
		
		
		
//		int[] arr = {5,1,4,3,2};
//		int min = arr[0];
//		int idx = 0;
//		for(int i = 0; i < arr.length; i++) {
//			idx = i;
//			for(int j = 0; j < arr.length; j++) {
//				if(min > arr[j]) {						
//					arr[0] = arr[1];
//					arr[1] = arr[0];
//					
//					
////					min = arr[j];
////					arr[j]=arr[j-1];
////					arr[j-1]=min; 
//					
//					}
//					
//				}
//			}
////			System.out.println(idx);
//			System.out.println(min);
////			System.out.println(Arrays.toString(arr));
		
		
		
	}
}
