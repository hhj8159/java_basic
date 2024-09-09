package day2;

public class SingletonTest {
//	final : 클래스(이 클래스에 대한 상속은 여기까지. 그 이상 상속불가 ex)String), 
//	        메서드(오버라이드 금지.) 
//			필드( 
	final int i;
	public SingletonTest(int i) {
		this.i = i;
	}
//	String str
	public static void main(String[] args) {
		
		
		
//		Singleton singleton = new SingletonTest();
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		Singleton s3 = Singleton.getSingleton();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		/*  회원
		 * 	책
		 *  구매 
		 */
		
	}
}
