package lesson09_interface;

public class ComplexerMain {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		
//		System.out.println(com.INK);
		
		System.out.println(com.FAX_NUMBER);
		System.out.println(Complexer.INK);
		System.out.println(Printer.INK);
		
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
		Fax fax = new Fax() {

			@Override
			public void send(String msg) {
				// TODO Auto-generated method stub
				System.out.println("fax 송신");
			}

			@Override
			public void receive(String msg) {
				// TODO Auto-generated method stub
				System.out.println("fax 수신");
			}
				
		};
		
		fax.send("abcd");
		
		Complexer com2 = new Complexer() {
			public void scan() {
				System.out.println("com2의 스캔");
			}
		};
		
		com2.print();
		com2.scan();
		
		// comparator : 비교'자  er, or 로 끝나면 객체 생성하려고
		// comparable : 비교'가능한
				
		
		
	}
}
