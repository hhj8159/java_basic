package student;


// 학생 예제 > java beans 명세서에 맞게끔 수정
// field는 private, method는 public
public class Student {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public Student() {
		
	}
	
	public Student(int no, String name, int kor, int eng, int mat) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// no getter
	public int getNo() {
		return no;
	}
	
	// no setter
	public void setNo(int no) {
		this.no = no;
	}
	
	public String toString() {
		return String.format("%3d %4s %5d %5d %5d %5d %6.2f\n", no, name, kor, eng, mat, total(), avg());

	}
	
	int total() {
		return kor + eng + +mat;
	}
	
	double avg() {
		return total() / 3d;
	}
	
	
}
