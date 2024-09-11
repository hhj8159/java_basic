package lesson10_ex240910;

class Cylinder extends Shape{
	private int r, h;	
	Cylinder(int r, int h) {
		super("원기둥");
		this.r = r;
		this.h = h;		
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r * r + 2 * Math.PI * r * h;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}
	@Override
	double volume() {
		// TODO Auto-generated method stub
		return Math.PI * r * r * h;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape [ type = " + getType() + ", r = " + r + ", h = " + h + "]"; 
	}	
	
	
}