package lesson06_array;

import java.util.Arrays;

public class ArrEx {
	public static void main(String[] args) {
		// 배열의 길이 늘리기
		
//		System.out.println("첫번쨰 값 : " + args[0]);
//		System.out.println("두번쨰 값 : " + args[1]);
		// 객체 : object 변수
		// 대문자 시작은 참조형
		// 참조형 타입의 변수가 객체
		
	    int[] arr = {1,2,3,4};
	    int[] arr2 = new int[arr.length * 2];
	    for (int i = 0 ; i < arr.length ; i++) {
	    	arr2[i] = arr[i];
	    }
//	    for (int i = 0 ; i < arr2.length ; i++) {
//	    	System.out.println(arr2[i]);
//	    }
	    System.out.println(Arrays.toString(arr2));
	    
	    arr = arr2;
	    
	    System.out.println(Arrays.toString(arr));
		
		
		
	}

}
