package lesson06_array;

import java.util.Arrays;

public class Ref {
	public static void main(String[] args) {
//		int[] arr = {1,2,5,7,9};
//		int[] arr2 = arr;
//		
//		arr[0] = 10;
//		System.out.println(arr2[0]);
//		
//		
//		int a = 10;
//		int b = a;
//		
//		a = 20;
//		System.out.println(b);
//		
//		System.out.println(0x22);
		
		 int[] arr = {1,2,3,4};
		 System.out.println(arr);
		    int[] arr2 = new int[arr.length * 2];
		    System.out.println(arr2);
		    for (int i = 0 ; i < arr.length ; i++) {
		    	arr2[i] = arr[i];
		    }
		    
		    arr = arr2;
		    
		    System.out.println(arr);
			
	}

}
