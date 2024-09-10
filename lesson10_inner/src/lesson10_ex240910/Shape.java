package lesson10_ex240910;


abstract class Shape{
	String type;
	Shape(String type) {
		this.type = type;		
	}
	abstract double area();
	abstract double length();
	
	
}

