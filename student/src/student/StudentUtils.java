package student;

import java.util.Scanner;

public class StudentUtils {
	static Scanner scanner = new Scanner(System.in);
	
	
	
	//scanner 없이 입력하려고 함
	static String nextLine(String msg) {
		System.out.print(msg);
		System.out.print("> ");
		return scanner.nextLine();
		
	}
	
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
	
	
	
}
