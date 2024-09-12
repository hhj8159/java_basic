package student;



//학생 예제 > java beans 명세서에 맞게끔 수정
//field는 private, method는 public
//240911 과제 예외처리 하기
//이름은 반드시 한글 완성형, 이름 입력 하지 않는 것도 불가, 최소 2 최대 4글자의 한글
//과목 점수 범위 0~100
//학번 중복 안됨

//학번 오름차순 이름 오름차순 점수 내림차순

//학생 예제 > java beans 명세서에 맞게끔 수정
//field는 private, method는 public
//240911 과제 예외처리 하기
//이름은 반드시 한글 완성형, 이름 입력 하지 않는 것도 불가, 최소 2 최대 4글자의 한글
//과목 점수 범위 0~100
//학번 중복 안됨

//학번 오름차순 이름 오름차순 점수 내림차순



public class Student implements Cloneable{
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int[] arr;
	
//	public Student() {
//		
//	}
	
	public Student(int no, String name, int kor, int eng, int mat) {
		super();
		this.no = no;
		this.setName(name);
		this.setKor(kor);
		this.setEng(eng);
		this.setMat(mat);
	}
	
	public Student(Student s) {
		no = s.no;
		name = s.name;
		kor = s.kor;
		eng = s.eng;
		mat = s.mat;
		if(s.arr != null)
		arr = s.arr.clone(); // 깊은 복사
//		arr = s.arr; 얕은 복사
//		setNo(s.getNo()); clone   get set 할 필요가 없다.
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

	
	// 클론 연습용
	
	@Override
	public Student clone(){
		Student obj = null;		
		try {
			obj = (Student)super.clone();
			if(arr != null)
				obj.arr = arr.clone(); // <- Deep Copy
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	// 이퀄스 연습용
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Student)) return false;
		Student s = (Student)obj;
		return no == s.no && name.equals(s.name);		
	}
	
	
	
	public class RangeException extends RuntimeException{
		int start;
		int end;
		
		public RangeException(int start, int end) {
			this(start, end, start + "이상" + end + "이하의 값을 입력하세요");
		}
		public RangeException(int start, int end, String msg) {
			super(msg);
			this.start = start;
			this.end = end;
		}
	}	
}