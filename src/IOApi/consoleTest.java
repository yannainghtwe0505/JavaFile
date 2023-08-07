package IOApi;

import java.io.Console;

public class consoleTest {
	public static void main(String[] args) {
		System.out.println("Hello world");
		Console console = System.console();
		if (console == null) {
			throw new RuntimeException("Console not available");
		} else {

			console.writer().println("Welcome to Our Zoo!");
			console.format("It has %d animals and employs %d people", 391, 25);
			console.writer().println();
			console.printf("The zoo spans %5.1f acres", 128.91);
		}
	}

}
