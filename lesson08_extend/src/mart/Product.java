package mart;

//상속 관련 예제
public abstract class Product {
	private String name; // 조상
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override // 필드
	public String toString() {
		return "[" + name + "," + price + "]";

	}

}
