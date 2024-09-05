package lesson07_oop;

public class Selection {
	public static void main(String[] args) {
		// 회차 반복문
		// 최소값 찾기 반복문 내부
		// - 최소값이 존재하는 인덱스
		// - 0번째 위치의 값이 위 인덱스에 있던 값과 교환
		
		int[] arr = {5,1,4,3,2};
		int idx = 0;
//		int[] arr2 = new int[5];
		int min = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
//					arr2[0] = min; 
				}
			}
			
			System.out.println(min);
		
		
		
	}
}
