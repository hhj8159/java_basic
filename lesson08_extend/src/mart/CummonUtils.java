package mart;

import java.util.Scanner;

public class CummonUtils {
	static Scanner scanner = new Scanner(System.in);

	static String nextLine(String msg) {
		System.out.print(msg);
		System.out.print("\n> ");
		return scanner.nextLine();

	}

	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}

}