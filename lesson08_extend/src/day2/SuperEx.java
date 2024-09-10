package day2;

public class SuperEx {
	public static void main(String[] args) {
		Child child = new Child();
		child.print();
	}
}
class Parent {
	int number = 3;
	
	Parent() {
		
		super();
		System.out.println("부모 객체 생성");
	
		
	}
	Object m() {
		return null;
	}
}

class Child extends Parent {
	int number = 2;
	
	Child() {
		super();
		System.out.println("자식 객체 생성");
	}
	
	Integer m() {
		return 0;
	}
	void print() {
		int number = 1;
		System.out.println(number); // 메서드 지역 변수 number
		System.out.println(this.number); // 자신 각체의 number
		System.out.println(super.number); // 부모 객체의 number
		
	}
}