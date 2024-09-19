package lesson13_collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("가");
		set.add("나");
		set.add("다");

		System.out.println(set.add("가"));
		System.out.println(set.add("라"));
		// 중복을 허용하지 않는다
		System.out.println(set);
		System.out.println();
	}
}
