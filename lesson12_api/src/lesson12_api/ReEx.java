package lesson12_api;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("b[a-z]+"); // 시작글자는 b여야만 한다
		Pattern pattern = Pattern.compile("b[A|a]+"); 
		Matcher m;
		
		m = pattern.matcher("bat");
		System.out.println("bat = " + m.matches());
		
		m = pattern.matcher("cat");
		System.out.println("cat = " + m.matches());
		
		m = pattern.matcher("bed");
		System.out.println("bed = " + m.matches());

		m = pattern.matcher("b");
		System.out.println("b = " + m.matches());
		
		m = pattern.matcher("ba");
		System.out.println("ba = " + m.matches());
		
//		String emailRegex = "^[a-zAZ0-9._%+-]+@[a-z"
		
		
		System.out.println("bat".matches("b[a-z]*"));
		// [^0-9] = \D
		
		int[] arr = new int[5];
		arr[0] = 1;
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		System.out.println(list.size());
	}
}
