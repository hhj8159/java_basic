package Lesson08_extend;

public class SmartPhoneMain {
	public static void main(String[] args) {
			Phone p = new Phone("전화기", "화이트", "현대");
			System.out.println(p);
			p.call();
			p.receive();
			
			SmartPhone sp = new SmartPhone("갤력시", "블랙", "삼성");
			System.out.println(sp);
			sp.call();
			sp.receive();
			sp.installApp();
		
	}
}
