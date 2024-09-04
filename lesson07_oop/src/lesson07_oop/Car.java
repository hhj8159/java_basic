package lesson07_oop;

public class Car {
	// 필드
	String color;
	String company;
	String type;
	
	//메서드
	// **이 2개가 들어가면 정보 주석, 주로 메서드에 활용
	/**
	 * 전진하는 메서드
	 */
	void go() {
		System.out.println("전진하다.");
	}
	/**
	 * 전진하는 메서드
	 */
	void back() {
		System.out.println("후진하다.");
	}

}
