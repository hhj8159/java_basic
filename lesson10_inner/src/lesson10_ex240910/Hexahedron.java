package lesson10_ex240910;

class Hexahedron extends Shape{
	private int width, height, h;
	Hexahedron(int width, int height, int h) {
		super("육면체");
		this.width = width;
		this.height = height;
		this.h = h;		
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height * 2 + (width + height + width + height) * 5;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}
	@Override
	double volume() {
		// TODO Auto-generated method stub
		return width * height * h;
	}
	@Override
	public String toString() {
		return "Shape [ type = " + getType() + ", width = " + width + ", height = " + height + ", h = " + h + "]";
	}
	
	
	
}