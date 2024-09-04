package day2;

import java.util.Arrays;

public class Exer {
	public static void main(String[] args) {
		// 버블 정렬 
		// {5, 10, 1, 2, 7} 각 숫자를 비교 후 교환
		
//		int arr[] = {2,1,10,7,5};
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("초기 ::" + Arrays.toString(arr));
		// 회차 반복
		for(int i = 0; i < arr.length - 1; i++) {
			// 비교 반복
			for(int j = 0; j < arr.length - 1 - i; j++) { //  0,1,2,3
				//값 비교 자리 교환
				if(arr[i] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			System.out.println(i + 1 + "회차 :: " + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
			
	}
}
