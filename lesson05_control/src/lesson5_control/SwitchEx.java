package lesson5_control;

public class SwitchEx {
	public static void main(String[] args) {
		// IfEx4 계절 계산을 switch로 변환
//		int month = 5; // 1~12
//		
//		if(month >= 3 && month <= 5) {
//			System.out.println("봄");
//		
//		}
//		else if(month >= 6 && month <=8) {
//			System.out.println("여름");
//		}
//		else if(month >= 9 && month <=11) {
//			System.out.println("가을");
//		}
//		else {
//			System.out.println("겨울");
//		}
		
		int month = 3;
				
		switch (month/3) {
		case 1:
			System.out.println("봄");
			break;
		case 2: 
			System.out.println("여름");
			break;
		case 3: 
			System.out.println("가을");
			break;
		default :
			System.out.println("겨울");
		}
		
//		switch (month) {
//		case 3: case 4: case 5:
//				System.out.println("봄");
//				break;
//		case 6: case 7: case 8:
//			System.out.println("여름");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("가을");
//			break;
//		default :
//			System.out.println("겨울");
//		}
		

	}

}
