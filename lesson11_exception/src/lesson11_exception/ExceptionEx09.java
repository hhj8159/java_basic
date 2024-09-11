package lesson11_exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionEx09 {
	public static void main(String[] args) {
//		String str = "abcd";
//		String str2 = str;
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr;
		int[] arr3 = arr.clone();
		arr[0] = 10;
		
		FileOutputStream fos = null;
		try (FileOutputStream fos1 = new FileOutputStream("1. txt")) {
			byte[] bs = {'A', 'B', 'C', 'D', 'E', 234-256, 176-256, 128-256};
			fos1.write(bs);
		}

			catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}
}
