import java.util.*;

public class UserInterface {

	public static void main(String[] args) {

		Products p = new Products();
		char ch = 'y';
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("1.Add");
				System.out.println("2.Display");
				System.out.println("3.Exit");
				System.out.println("Enter your choice");

				int choice = sc.nextInt();

				sc.nextLine();
				switch (choice) {
				case 1:

					if (p.getProductList().isEmpty()) {
						System.out.println("The list is empty");
					}
					System.out.println("Enter the product");
					String prdName = sc.nextLine();
					p.addProductToList(prdName);
					break;
				case 2:
					p.sortProductList();
					break;
				case 3:
					System.out.println("Thank you for using the application");
					ch = 'Y';
					break;
				}
			} while (ch != 'Y');
		}

	}

}
