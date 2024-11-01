import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		NumAvg na = new NumAvg();
		char ch = 'y';

		do {
			System.out.println("1.Add number");
			System.out.println("2.Find average");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the number");
				int number = sc.nextInt();
				na.addNum(number);
				break;

			case 2:
				double avg = na.calAvg();
				if (na.getNumSet().isEmpty()) {
					System.out.println("The set is empty");
				} else {
					System.out.println(avg);
				}
				break;
			case 3:
				System.out.println("Thank you for using the application");
				ch = 'Y';
				break;

			}
		} while (ch != 'Y');
	}

}
