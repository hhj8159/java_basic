package lesson09_interface_starcraft;

public interface Repairable {
	static void sm() {
		System.out.println("sm()");
	}
	
	default void dm() {
		System.out.println("dm()");
	}
}
