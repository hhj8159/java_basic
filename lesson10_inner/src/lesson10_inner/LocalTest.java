package lesson10_inner;

public class LocalTest {
	
	static MyInter create() {
		class MyClass implements MyInter {
			public MyClass() { }
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("MyClass.run()");
			}
			
		}
		return new MyClass();
	}
	static MyInter create2() {
		return new MyInter() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("create2().run()");
			}
		};
	
	}
	
	static MyInter create3() {
		return () -> System.out.println("lmabda.run()");
	}
	
	public static void main(String[] args) {
		MyInter mi = create();
		mi.run();
		create2().run();
		create3().run();
	}
}


interface MyInter {
	void run();
}


// 240910 과제 
// 원, 사각형 - 둘레계산(length) 넓이계산(area)  
// 원기둥, 육면체 - 넓이계산 부피계산(volume)
// 네 개의 구상 클래스
// 하나의 배열 관리
// public private 접근제한자 명확하게


