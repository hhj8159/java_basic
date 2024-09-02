package lesson04_operater;

public class OpEx5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		//AND
		System.out.println(a > b && a == 10); //t
		System.out.println(a > b && a == b); //f
		//OR
		System.out.println(a > b || a == b); //t
		System.out.println(a < b || a == b); //f
		//XOR 둘 중 하나가 true일 경우 true 나머지는 false
		System.out.println(a > b ^ a == 10); //f
		System.out.println(a > b ^ a == b); //t
		//NOT
		System.out.println(!(a > b)); //f
		System.out.println(!(a < b)); //t
		
		
	}

}
