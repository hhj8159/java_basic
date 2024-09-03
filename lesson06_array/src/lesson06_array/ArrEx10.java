package lesson06_array;

public class ArrEx10 {
	public static void main(String[] args) {
		int[] arr = {5, 10, 20, 7, 3};
		
		// 해당 배열에서 최대값을 구해서 출력		
		int max = arr[0];
		int min = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
		// 배열 요소의 합계 / 평균 구하기		
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		double avg = sum / arr.length;
		System.out.println(avg);
		
		
		
		
	}

}
