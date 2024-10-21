package student_simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		
		// var s = {};
		Student s = new Student();
		s.no = 10;
		s.name = "길동";
		s.kor = 80;
		s.eng = 80;
		s.mat = 80;
				
		System.out.println(s.total());
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 5, 4, 3, 2, 20));
		list.sort(new MyComp());
		System.out.println(list);
		Comparator<Integer> comp = new Comparator<Integer>() {			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		};
		
	}
}

class MyComp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
}
