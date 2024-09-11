package lesson10_ex240910;
//240910 과제 
//원, 사각형 - 둘레계산(length) 넓이계산(area)
//원기둥, 육면체 - 넓이계산 부피계산(volume)
//네 개의 구상 클래스
//하나의 배열 관리
//public private 접근제한자 명확하게
public class ShapeMain {
	public static void main(String[]arg) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		shapes[2] = new Cylinder(5, 10);
		shapes[3] = new Hexahedron(4, 3, 5);
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("넓이:" + s.area() + " 둘레:" + s.length() + " 부피:" + s.volume());
			System.out.println();
			
		}
	}
}