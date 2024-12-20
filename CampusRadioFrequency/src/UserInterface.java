import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Scan the radio station");
		float freq = sc.nextFloat();

		// fill in the code
		Validator v = new Validator();
		try {
			boolean res = Validator.validateStation(freq);
			if (res) {
				System.out.println(freq + " is the right frequency");
			}
		} catch (StationNotAvailableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
