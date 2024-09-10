package day2;

public class TaxiMain {

	public static void main(String[] args) {
		Object o = 10;
		System.out.println(o);
		new Taxi().go();
		
		Taxi t = new Taxi();
		t.go();
	}
}
