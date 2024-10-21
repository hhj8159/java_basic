package student_simple;

public class Student {
	int no;
	
	{
		System.out.println(no); // 0
		no = 10;
		System.out.println(no); // 10
		// 자바는 블록이 중요함
	}
	
	String name;
	
	int total() {
		return kor + eng + mat;
	};
	
	int kor;
	int eng;
	int mat;	
	
}
