package Shape;

public class Cylinder extends Shape implements D3{
	private Circle circle;
	private int z;
	public Cylinder(int r, int z) {
		super("원기둥");
		circle = new Circle(r);
		this.z = z;
	}

	public Cylinder(Circle circle, int z) {
		super("원기둥");
		this.circle = circle;
		this.z = z;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return circle.area() * z;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return circle.area() * 2 + circle.length() * z;
	}

	@Override
	public double length() {
		// TODO Auto-generated method stub
		return 0;
	}

}
	
	

