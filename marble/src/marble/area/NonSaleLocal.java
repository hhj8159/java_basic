package marble.area;

public class NonSaleLocal extends Local{
//	구매불가능 : 시작, 보너스게임, 포츈카드, 무인도, 올림픽, 세계여행, 국세청
	int type;
	
	public NonSaleLocal(int type, String name, int idx) {
		super(name, idx);
		this.type = type;
	}
	
//	String getKind() {
//		String str = "시작,보너스게임,포츈카드,무인도,올림픽,세계여행,국세청";
//		return str.split(",")[type];
//		
//	}
}
