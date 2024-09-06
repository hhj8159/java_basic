package student;

import java.util.Scanner;

public class StudentMain {
	private static int input;

	public static void main(String[] args) {
		// ex)bank 학생 데이터 관리
		// UI
		// CRUD : Create Read Update Delete
		// 등록 (이름, 국영수, 학번)
		// 조회 (학번, 이름, 석차 정렬)
		// 업데이트
		// 삭제 (학번으로 삭제)
		// Car 배열
		
		Scanner scanner = new Scanner(System.in);
		StudentService ss = new StudentService();	
		while(true) {
//			System.out.println("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
//				int input = Integer.parseInt(scanner.nextLine());
			StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
			switch (input) {
			case 1:
				ss.list();
				break;
			case 2:
				ss.add();
				break;
			case 3:
				ss.modify();
				break;
			case 4:
				ss.remove();
				break;
			case 5:
				System.out.println("bye");
				return;
			default:
				break;
					
		
		
			}
		}
		
		
		
		
	}
}
