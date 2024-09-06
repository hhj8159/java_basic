package day2;

public class Student {
	int no; // 학번
	String name; // 이름
	
	Student() {}	
	Student(int i, String s) {
//		생성자의 첫줄 super(인자호출구간), 혹은 this()
//		super();
		no = i;
		name = s;
	}
	Student( String s, int i) {
		this(s); // 내가 가지고 있는 다른 생성자를 지칭
		no = i;
	}
	Student(String s) {
		name = s;
	}
	
	void printThis() {
		System.out.println(this);
	}
	
	Student returnThis() {
		return this; // 나의 인스턴스를 반환함
	}
	
}
