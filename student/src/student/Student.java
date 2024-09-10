package student;

//학생 예제 > java beans 명세서에 맞게끔 수정
//field는 private, method는 public
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
		this.setName(name);
		this.setKor(kor);
		this.setEng(eng);
		this.setMat(mat);
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
		return String.format("%3d %4s %5d %5d %5d %5d %6.2f\n", no, getName(), getKor(), getEng(), getMat(), total(), avg());

	}
	
	int total() {
		return getKor() + getEng() + +getMat();
	}
	
	double avg() {
		return total() / 3d;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	
}