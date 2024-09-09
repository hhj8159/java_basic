package student;
import static student.StudentUtils.*;

import java.util.Arrays;

//Logic
public class StudentService {
	Student[] students = new Student[5];
	int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
		students[cnt++] = new Student(3, "말똥이", 77, 66, 77);
	}
	
	// 학생 등록 레지스트
	void add() {
		//풀이
		int no = nextInt("학번");
		String name = nextLine("이름");
		int kor = nextInt("국어");
		int eng = nextInt("영어");
		int mat = nextInt("수학");
		if(cnt == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
		}
		students[cnt++] = new Student(no, name, kor, eng, mat);
		System.out.println(students);
//		int no = StudentUtils.nextInt("학번");
//	  	String name = StudentUtils.nextLine("이름");
//	  	int kor = StudentUtils.nextInt("국어 점수");
//	  	int eng = StudentUtils.nextInt("영어 점수");
//	  	int mat = StudentUtils.nextInt("수학 점수");
//		students[cnt++] = new Student(no, name, kor, eng, mat);
//		System.out.println("등록 완료");
		
	}
	// 학생 목록 조회
	void list()	{
//		System.out.println("list()");		
//		int no = StudentUtils.nextInt("1. 학번 정렬 2. 이름 정렬 3. 석차 정렬");
		
		System.out.println("==========================================");
		System.out.println("학번   이름   국어  영어  수학  총점  평균");
		System.out.println("==========================================");
		for(int i = 0; i < cnt; i++) {
//			System.out.printf("%3d %4s %5d %5d %5d %5d %6.2f",
//					students[i].no,
//					students[i].name,
//					students[i].kor,
//					students[i].eng,
//					students[i].mat,
//					students[i].total(),
//					students[i].avg()
//					);
			System.out.println(students[i]);
		}
	
		
	}
	// 학생 이름, 점수 수정
	void modify() {
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생
		// 3. 이름, 국어, 영어, 수학 점수 변경
		/*
		 *  
		 */
		Student s = findByNo();
		if(s == null) {
			System.out.println("해당 학번은 존재하지 않습니다");
			return;			
		}
		s.name = nextLine("이름");
		s.kor = nextInt("국어");
		s.eng = nextInt("영어");
		s.mat = nextInt("수학");

//		System.out.println("modify()");
//		System.out.println("학생 정보 수정");
//		int no = StudentUtils.nextInt("해당 학생의 학번");
		//		String name = nextLine("이름");
//		int kor = nextInt("국어");
//		int eng = nextInt("영어");
//		int mat = nextInt("수학");
//		s.name = name;

		
				
	}
	
	//학생 삭제
	void remove() {
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생
		Student s = findByNo();
		if(s == null) {
			System.out.println("해당 학번은 존재하지 않습니다");
			return;			
		}
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i] == s) { // i = 1
				// 삭제	
				System.arraycopy(students, i+1, students, i, cnt-- - i -1);
				break;
			}
		}
		
		
//		System.out.println("remove()");
//		System.out.println("학생 정보 삭제");
	}
		
	Student findByNo() {
		Student student = null;
		int no = nextInt("학번");
		for(int i = 0; i < cnt; i++) {
			if(students[i].no == no) {
				student = students[i];
			}
		}
		return student;
		
	}
	
	
	
	
}