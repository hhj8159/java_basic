package lesson07_oop;

public class MethodMain {
	public static void main(String[] args) {
		System.out.println(Param.min(1,2,3,4,5,6));
		System.out.println(Param.min()); // 길이가 0인 배열
		System.out.println(Param.min(new int[] {3,4,5})); // 길이가 0인 배열
		
	}
}

class Param {
	int add(int a, int b) {
		return a + b;
	}
	
	static int add2(int a, int b) {
		return a + b;
	} 
	
	static int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			return -1;
		}
		// 최대값 처리
		int ret = arr[0];
		for(int i : arr) {
			if(ret < i) {
				ret = i;
			}
		}
		return ret;
	}
	// 가변 인자
	static int min(int... num) {
		if(num == null || num.length == 0) {
			return -1;
		}
		// 최대값 처리
		int ret = num[0];
		for(int i : num) {
			if(ret > i) {
				ret = i;
			}
		}
		return ret;
	}
	
}