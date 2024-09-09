package day2.ex2;

public class Init {
	private static Init init = new Init(); // static이 붙으면 클래스가 됨 클래스는 한 번 초기화함
	public Init() {
		System.out.println("초기화");
	}
	public static void main(String[] args) {
//		new Init();
//		main(args);
//		System.out.println(fact(6));;
//		int result = 1;
//		for(int i = 2; i <= 6 ; i++) {
//			result *= i;
//		}
//		System.out.println(result);
	}
	
	static int fact(int i) {
		if(i == 1) {
			return 1;
		}
		
		int result = fact(i - 1) * i;
		return fact(i - 1);
	}
}
