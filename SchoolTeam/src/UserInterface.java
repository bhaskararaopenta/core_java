import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {

		ClassHouseFormation chf = new ClassHouseFormation();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int noOfStudents = sc.nextInt();
		sc.nextLine();
		if (noOfStudents > 0) {
			System.out.println("Enter the details");
			for (int i = 0; i < noOfStudents; i++) {
				String name = sc.nextLine();

				chf.addName(name);
			}
		} else {
			System.out.println("Invalid input");
		}

		HashSet<String> team = chf.formTeam();
		for (String member : team) {
			System.out.println(member);
		}
	}
}
