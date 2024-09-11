package lesson10_ex240910;

class Rectangle extends Shape{
	private int width, height;
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}
	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape [ type = " + getType() + ", width = " + width + ", height = " + height + "]"; 
	}
	@Override
	double volume() {
		// TODO Auto-generated method stub
		return 0;
	}	
}