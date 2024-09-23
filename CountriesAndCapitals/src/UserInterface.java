import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Country coun = new Country();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		do {
			System.out.println("1.Add");
			System.out.println("2.Search");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter the country name ");
				String countryName = sc.nextLine();
				System.out.println("Enter the capital name ");
				String capitalName = sc.nextLine();
				coun.add(countryName, capitalName);
				break;
			case 2:
				if (coun.getCountryMap().isEmpty()) {
					System.out.println("The map is empty");
				} else {
					System.out.println("Enter the country name");
					String wantedCapital = sc.nextLine();
					String result = coun.search(wantedCapital);
					System.out.println(result);
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
