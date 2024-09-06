package lesson07_oop;

import java.util.Arrays;

public class Insertion {
	public static void main(String[] args) {
		// 적운 인덱스에서부터 시작 (회차)
		// 어레이즈카피
		// 현재 위치의 인덱스 미만의 값들과 대소 비교
		// - 조건을 검수 후 해당 위치에 삽입 예정
		// - 해당 위치에서 부터 한 칸씩 우측 이동
		// - 예정 위치에 해당 값 대입
		
		
		int[] arr = {1,3,4,5,2};
		// 3번 인덱스의 값을 맨 앞으로 보내기
		
		// {3,5,4,1,2} 여기서 회차 시작
		// {3,5,1,4,2}
		// {3,1,5,4,2}
		// {1,3,5,4,2} 여기까지가 하나의 회차
		
		// {3,5,4,1,2}
		// {3,4,5,1,2}
		// {3,4,5,1,2}
		
//		for(int i = 0; i <arr.length; i++) {
//	}
		for(int j = 1; j <arr.length; j++) {
			System.out.println(j + "회차");
			for(int i = j; i > 0; i--) {
				if(arr[i] < arr[i-1]) {
					int tmp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			
			}
		}
		
//		if(arr[3] < arr[2]) {
//			int tmp = arr[3];
//			arr[3] = arr[2];
//			arr[2] = tmp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		if(arr[2] < arr[1]) {
//			int tmp = arr[2];
//			arr[2] = arr[1];
//			arr[1] = tmp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		if(arr[1] < arr[0]) {
//			int tmp = arr[1];
//			arr[1] = arr[0];
//			arr[0] = tmp;
//		}
//		System.out.println(Arrays.toString(arr));
				
		
	}
}
