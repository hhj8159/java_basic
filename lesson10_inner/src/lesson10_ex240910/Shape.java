package lesson10_ex240910;


abstract class Shape {
	private String type;
	Shape(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	abstract double area();
	abstract double length();
	abstract double volume();
}