package lesson5_control;

public class ForEx {
	public static void main(String[] args) {
		//scope : 변수의 유효범위
		int i = 0;
		for(i = 0 ; i < 10 ; i++) {
			System.out.println("i = " + i);
		}
		System.out.println(i);
	}
}
