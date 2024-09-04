package lesson06_array;

public class Exer240903_2 {
	public static void main(String[] args) {
	
//		int num1 = 0;
//		int num2 = 0;
//		
//		// 12 * 18 / 6
//		System.out.println(12 * 18 / 6);
//		
//		// 7 8
//		num1 = 12;
//		num2 = 18;
//		System.out.println("================");
//		for(int i = num1 ; i <= num1 * num2 ; i += num1) {
//			System.out.println(i);
//		}
//		for(int j = num2 ; j <= num1 * num2 ; j += num2) {
//			System.out.println(j);
//		}
		
		
		int num = 12321; // 54321
		int result = 0;
		int tmp = num;
		
		while(tmp != 0) {
//			System.out.println(tmp);
//			System.out.println(tmp % 10);
			result = result * 10 + tmp % 10;
			tmp /= 10;			
		}		
		System.out.println(result == num ? "회문수" : "아님");

	}

}
