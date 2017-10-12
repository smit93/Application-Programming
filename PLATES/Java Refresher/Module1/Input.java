import java.util.*;

public class Input {
	private static final Scanner scanner = new Scanner(System.in);
	public static String askString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}
	public static int askInt(String question) {
		System.out.print(question + " ");
		int result = scanner.nextInt();
		scanner.nextLine();
		return result;
	}
	public static double askDouble(String question) {
		System.out.print(question + " ");
		double result = scanner.nextDouble();
		scanner.nextLine();
		return result;
	}
	public static char askChar(String question) {
		System.out.print(question + " ");
		return scanner.nextLine().charAt(0);
	}
	public static boolean askBoolean(String question) {
		System.out.print(question + " ");
		boolean result = scanner.nextBoolean();
		scanner.nextLine();
		return result;
	}
}
