package lesson09_interface;

public class Complexer implements Printer, Scanner, Fax{

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println(FAX_NUMBER + "에서 " + msg + "로 FAX 전송");
	}

	@Override
	public void receive(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg + "에서 " + FAX_NUMBER + "로 FAX 수신");
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("스캔 실행");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("출력 실행");
		
	}
	
	
}
