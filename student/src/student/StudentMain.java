package student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
	private static int input;
//	private static int input2;


	public static void main(String[] args) {
		// ex)bank 학생 데이터 관리
		// UI
		// CRUD : Create Read Update Delete
		// 등록 (이름, 국영수, 학번)
		// 조회 (학번, 이름, 석차 정렬)
		// 업데이트
		// 삭제 (학번으로 삭제)
		// Car 배열

		StudentService ss = new StudentService();	
		
		while(true) {
			try {
				int input = ss.checkRange(StudentUtils.next("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료", Integer.class, n -> n >= 1 && n <= 5, "1~5사이의 값을 입력하세요");
				switch (input) {
				case 1:
					ss.list();
					
					break;
				case 2:
					ss.add();
					ss.cloneAndSort();
					break;
				case 3:
					ss.modify();
					ss.cloneAndSort();
					break;
				case 4:
					ss.remove();
					ss.cloneAndSort();
					break;
				case 5:
					System.out.println("bye");
					return;
				default:
					break;
					
				}
			}
			catch(NumberFormatException e) {
				System.out.println("정확한 숫자를 입력하세요");
			}
			catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		
		
	}
}