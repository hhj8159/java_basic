package day2;

public class info {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][1] = 5;
		
		System.out.println(matrix[0][1]);
		
		matrix = new int[][] {
			{1, 2, 3}, 
			{4, 5, 6}, 
			{7, 8, 9}
		};
		
		// 일반 for 인덱스가 중요할때
		for(int i = 0 ; i < matrix.length ; i++) {
			for(int j = 0 ; j < matrix[0].length ; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// 항상 for 값이 중요할때
		for(int[] arr1 : matrix) {
			for(int num : arr1) {
				System.out.print(num + " ");
			}
			System.out.println();
		}		
		
		// 항상 for
	}
}
