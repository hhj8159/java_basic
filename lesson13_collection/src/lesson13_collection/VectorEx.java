package lesson13_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Double> vector = new Vector<>();
		
		// add, size, get
		vector.add(Math.PI);
		System.out.println(vector.size());
		System.out.println(vector.get(0));
		
		vector.addElement(Math.E);
//		vector.elementAt(0); // get과 같음
		System.out.println(vector.elementAt(0));
		
//		vector.remove(0);
		vector.removeElement(Math.PI);
		System.out.println(vector);
		
//		vector : legacy class  잘 쓰지 않는다
		
		List<Double> list = new ArrayList<Double>(vector);
		System.out.println(list);
		
	}
}
