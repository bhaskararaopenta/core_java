
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		Car c = new Car();
		// Code here
		do {
			System.out.println("1.Add car");
			System.out.println("2.Search by name");
			System.out.println("3.Search by count");
			System.out.println("4.Total");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");

			int choice = sc.nextInt();
			if (c.getCarMap().isEmpty()) {
				System.out.println("The map is empty");
			}
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter the car name");
				String carName = sc.nextLine();
				System.out.println("Enter no of cars sold");
				int noOfCarsSold = sc.nextInt();
				c.addCar(carName, noOfCarsSold);
				break;
			case 2:
				System.out.println("Enter the car name");
				String wantedCar = sc.nextLine();
				int totalCars = c.carByName(wantedCar);

				if (totalCars == -1) {
					System.out.println("Car not found");
				} else {
					System.out.println(totalCars);
				}

				break;
			case 3:
				System.out.println("Enter the count");
				int numberOfCars = sc.nextInt();
				List<String> carInNumbers = c.carByCount(numberOfCars);
				if (c.getCarMap().isEmpty()) {
					System.out.println("The map is empty");
				}

				else if (carInNumbers.isEmpty()) {
					System.out.println("No cars found");
				} else {
					for (String carNames : carInNumbers) {
						System.out.println(carNames);
					}
				}
				break;
			case 4:
				int allCars = c.totalCarsSold();
				System.out.println(allCars);
				break;
			case 5:
				System.out.println("Thank you for using the application");
				ch = 'Y';
				break;

			}
		} while (ch != 'Y');

	}
}
