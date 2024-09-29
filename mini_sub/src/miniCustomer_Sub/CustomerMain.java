package miniCustomer_Sub;

public class CustomerMain {
	public static void main(String[] args) {
		CustomerService cs = new CustomerService();
		
		System.out.println("****얼라딘입니다. 어서오세요****");

		while(true) {
			int input = MiniUtils.next("1. 로그인 2. 회원가입 3. 회원 목록 4. 종료", Integer.class ,  t -> t >= 1 && t <= 3, "1에서 3 사이의 수");
			switch (input) {
			case 1:
				cs.login();
				break;
			case 2:
				cs.customerAdd();
				break;
			case 3:
				cs.printCustomer();
				break;
			case 4:
				System.out.println("감사합니다");
				return;
			default:
				break;
			}
			
		}
	}

}
