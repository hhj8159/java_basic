package lesson5_control;

public class Gugu2 {
	public static void main(String[] args) {
		// A * B = C
		// B가 5였을때 건너뛰고 출력
		// B가 5였을때 반복 중지
		
		// A가 5였을때 건너뛰고 출력
		// B가 5였을때 i 반복 정지  밖에서 안에 영향을 미치는 경우(라벨)point: point;		
		
		point:
		for(int i = 2; i < 10; i++) {
			System.out.println("["+i+"단]");
			for (int j = 1; j < 10; j++ ) {
				if(j == 5 ) {
					break point;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	
	}

}
