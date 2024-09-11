package lesson10_ex240910;

//abstract class Circle extends Shape 
class Circle extends Shape {
	private int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return r * r * Math.PI;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape [ type = " + getType() + ", r = " + r + "]";
	}
	@Override
	double volume() {
		// TODO Auto-generated method stub
		return 0;
	}	
}