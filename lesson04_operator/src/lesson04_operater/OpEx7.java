package lesson04_operater;

public class OpEx7 {
	public static void main(String[] args) {
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		//
		int num = 70;
		// 짝수, 홀수
		String pass2 = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(pass2);
		
		String s = "ABCD";
		s += "가나다라";
		s += "1234";
		System.out.println(s);
		
		
		
		char ch = 'A';
		char ch2 = (char)(ch + 1);
		
		// 산술 형 상승 : int보다 작은 숫자 타입을 산술 연산시 int
		System.out.println(ch2);
		
		// int double char boolean
		
		// int > byte, short, char
		
		byte b = Byte.MAX_VALUE;
		byte b1 = 1;
		byte b2 = (byte)(b + b1); // 126
		System.out.println(b2);
	
		System.out.println(b + 1);
		
		int i = 300;
		byte b3 = (byte)i;
		
		System.out.println(i);
		System.out.println(b3);
		
		
		System.out.println(Integer.toBinaryString(i));
		// 100101100
		
		
		// '0' : 48, 'A' : 65, 'a' : 97, '가' : 44032
		System.out.println((char)('가'+1));
		
		// '힣'
		
		// unicode에 완성형 한글의 글자 객수 구하기
		
		System.out.println('9' - '0' + 1);
		System.out.println('Z' - 'A' + 1);
		System.out.println('힣' - '가'+1);
		
		System.out.println("===================================");
		
		int cnt = 0;
		for(ch = '가' ; ch < '까' ; ch++) {
			System.out.print(ch);
			cnt++;
		}
	
		System.out.println(cnt * 19);
		
		// unicode 2^16 65536 (0~65535)
		
		// 사과 123개 상자당 10개씩 들어갑니다.
		// 몇 개의 상자가 필요합니까?
		System.out.println("");
		
//		int apple = 123;
//		int box = 10;
//		System.out.println(apple / box + 1);
		
		int apple1 = 123;
		int box1 = 10;
		System.out.println(apple1 / box1 + (apple1 % box1 <= 10 ? 1 : 0));

		// 123 / 10 /13
		// box로 나눴을 때 나누어 떨어지면 그대로 /, / + 1해야한다.		
//		int result = apple % box == 0 ? apple / box : apple / box + 1;
		
		int result = (apple1 + 9) / box1;
		System.out.println(result);
		
		// 소수점 자르기 (반올림) 소수점 셋째 자리로
		// 3.141592
		// 3.142
		double pi = 3.141592;
		System.out.println(pi * 1000); 
		System.out.println((int)(pi * 1000 + 0.5) / 1000d); 
		
		long num1 = 1_000_000L * 1_000_000 / 1_000_000;
		
		
	
	
				
		
		
		
		
		
	}

}
