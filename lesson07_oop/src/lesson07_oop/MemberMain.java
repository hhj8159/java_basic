package lesson07_oop;

public class MemberMain {
//  여기가 필드
	Member member = new Member();
	int a = 10;
//  여기가 필드	//  . = of =  의
	public static void main(String[] args) {
		Member m = new Member(); // 어제 한 게임 // 제품 생성 
		m.age = 10;
		m.kor =90;
		m.eng =60;
		m.mat =80;
		System.out.println(m.kor + m.eng + m.mat);
		System.out.println(m.total()); 			
		Member m2 = new Member();// 오늘 한 게임
		m2.kor =90;
		m2.eng =100;
		m2.mat =80;
		System.out.println(m2.kor + m2.eng + m2.mat); // 위 아래 값이 결국 같다
		System.out.println(m2.total());				  // 	
		Member m3 = m;
		
		
		// Member m = new Member(); // 어제 한 게임
		//(타입)(객체) (인스턴스)
		
		// 클래스, 인터페이스, 배열 타입
		// 객체(변수)
		// =
		// new Member() : 인스턴스
		
		if(m == m2) {
			System.out.println("m, m2는 같은 객체");
		}
		else {
			System.out.println("m, m2는 다른 객체");
		}
		
		MemberMain mm = new MemberMain();
		MemberMain mm2 = new MemberMain();
		
	}

}
