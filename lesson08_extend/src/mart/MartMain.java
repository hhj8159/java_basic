package mart;

public class MartMain {
	public static void main(String[] args) {
		Buyer buyer = new Buyer(500);
		while (true) {
			int input = CummonUtils.nextInt("1. 상품 선택 2. 결제 하기");
			switch (input) {
			case 1:
				int i2 = CummonUtils.nextInt("1. TV 2. 컴퓨터 3. 에어콘");
				switch (i2) {
				case 1:
					buyer.buy(new Tv());
					break;
				case 2:
					buyer.buy(new Computer());
					break;
				case 3:
					buyer.buy(new AirCon());
					break;
				}
				break;
			case 2:
				buyer.purchase();
				break;
			default:
				break;
			}

		}

	}

}
