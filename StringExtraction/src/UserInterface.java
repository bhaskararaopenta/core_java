import java.util.Scanner;

public class UserInterface {

	public static void main(String args[]) {
		UserInterface ui = new UserInterface();
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter the String");
			String sentence = scanner.nextLine();

			System.out.println("Enter First Index");
			int number1 = scanner.nextInt();

			System.out.println("Enter Second Index");
			int number2 = scanner.nextInt();

			String result = ui.extractString(sentence, number1, number2);
			System.out.println(result);
		} finally {
			scanner.close();
		}
	}

	public String extractString(String sentence, int number1, int number2) {
		String result = null;
		try {
			String substring = sentence.substring(number1, number2);
			result = "The output string is " + substring + ".";
		} catch (StringIndexOutOfBoundsException e) {
			result = "Invalid index position.";
		} finally {
			result += " Thanks for using the application.";
		}
		return result;
	}

}
