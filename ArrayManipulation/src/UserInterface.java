import java.util.Scanner;
import java.util.*;

public class UserInterface {
	public String getDuplicateElement() {
		// Fill the code
		Scanner sc = new Scanner(System.in);
		String rs = "";
		try {
			System.out.println("Enter the size of an array");
			int sz = sc.nextInt();
			if (sz < 0) {
				throw new NegativeArraySizeException();
			}
			int arr[] = new int[sz];
			// initialize an array with the help of the Scanner class
			System.out.println("Enter the array elements ");
			for (int i = 0; i < sz; i++) {
				arr[i] = sc.nextInt();
			}
			// get the index of the element to be replicated
			System.out.println("Enter the position of the element to be replicated ");
			int index = sc.nextInt();
			// check the index within the bounds
			if (index >= sz) {
				throw new ArrayIndexOutOfBoundsException();
			}
			StringBuilder sb = new StringBuilder("The array elements are ");
			for (int a : arr) {
				sb.append(a + " ");
			}
			sb.append(arr[index]);
			rs = new String(sb);
			return rs;
		} catch (NegativeArraySizeException e) {
			return "Array size should be positive";
		} catch (ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		} catch (InputMismatchException e) {
			return "Input was not in the correct format";
		} finally {
			sc.close();
		}

	}

	public static void main(String[] args) {

		// Fill the code
		UserInterface ui = new UserInterface();
		String dupElem = ui.getDuplicateElement();
		System.out.println(dupElem);
	}
}