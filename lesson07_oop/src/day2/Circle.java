package day2;

public class Circle {
	static {
		
		
	}
	{
		//초기화블럭

	}
	double r;
	
	public Circle() {}
	public Circle(double r) {
		setR(r);
		
	}
	
	Circle setR(double r) {
		this.r = r;
		return this;
	}
	
	Circle printRound() {
		System.out.println(Math.PI * r * 2);
		return this;
	}
	
	Circle printArea() {
		System.out.println(Math.PI * r * r);
		return this;
	}
	
	void test() {
		double r = 0;
		System.out.println(r);
		System.out.println(this.r); // 동명의 변수가 있을 때 지역 변수가 아닌 멤버를 불러올때 
	}

}
