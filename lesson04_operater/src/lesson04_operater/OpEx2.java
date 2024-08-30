package lesson04_operater;

public class OpEx2 {
	public static void main(String[] args) {
		int a =10;
		int b = 10;
		
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		
//		int c = ++a;//전위 증감후 대입
//		int d = b++;//후위 대입후 증감
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		
//		int i = 0, sum = 0;
//		while(i <= 10) {
//			sum += i++;
////			i++;
//		}
//		System.out.println(sum);
		
		/*		 입력    출력
		 * 산술  숫자    숫자
		 * 비교	 숫자	 논리		
		 * 논리	 논리	 논리
		 * 
		 * 
		 * 대소비교
		 * 		
		 */
		boolean bool = 10 > 5;
//		if(bool == false)나 (bool == true) 이런 경우는 쓰지 않는다
		if(!bool) {
			
		}
		
	}

}
