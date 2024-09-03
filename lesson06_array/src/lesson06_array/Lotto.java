package lesson06_array;

public class Lotto {
		public static void main(String[] args) {
			// 1 ~ 45 6개의 숫자를 고르는 것	
			
			int[] lotto = new int[6]; // [0,0,0,0,0,0]			
			int idx = 0; 
			while (true) {
				int number = (int)(Math.random() * 45) + 1; //  10
				
				boolean insert = true;
				for (int i = 0 ; i <= idx ; i++) {
					if (lotto[i] == number) {
						insert = false;
						break;
					}
				}
				if (insert == true) {
					lotto[idx] = number;
					idx++;
				}
				if (idx == 6) break;
			}
			for (int i = 0 ; i < lotto.length ; i++) {
				System.out.println(lotto[i]);
			}
	
	}

}
