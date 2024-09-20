package lesson13_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FinalEx {
	public static void main(String[] args) {
		// Arrays, Collections, Objects  s붙으면 일단 .찍어
//		List<Integer> list = Arrays.asList(1,2,3,4) ;
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4)) ;
		System.out.println(list.get(2));
		list.add(10);
		System.out.println(list);
		Integer[] arr = {1,2,3,4,5,6,7};
		list = Arrays.asList(arr);

		list.toArray(arr); 
		System.out.println(Arrays.toString(arr));
		
		Collections.shuffle(list);
		System.out.println(list);
		Collections.sort(list); // List sort는 comparable 반드시 필요
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

		
		
	}
}
