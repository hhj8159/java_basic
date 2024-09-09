package marble;

public class Player {
	String name;
	
	public Player(String name) {
		this.name = name;
	}
	int money = 2_000_000;
	int idx;


	public String toString() {
		return name + "이" +  idx +"번째 위치에 존재합니다. 자산은" + money + "입니다.";
	}
	
}
