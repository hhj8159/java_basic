package card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 트럼프 카드

@NoArgsConstructor		// 인자없는 생성자
@AllArgsConstructor
@Data		// Data하나로 아래 4개 포함
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
public class Card {
	// 숫자기호, 모양 
	private int num; // 234567890JQKA // 0~12
	private int kind; // 0 CLOVER, 1 HEART, 2 DIA, 3 SPADE // 0~3
	private boolean joker = true;
	
	public Card(int num, int kind) {
		this.num = num;
		this.kind = kind;
		joker = false;
	}
	
	public String toString() {
		// 
		String nums = "234567890JQKA";
		String[] kinds = {"CLOVER", "HEART", "DIA", "SPADE"};
		return joker ? "[JOKER]" : "["+ kinds[kind] +"," + nums.charAt(num) + "]";
	}

}
