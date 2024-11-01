import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserInterface {

	public String findPetName(String fileName) {

		String finalWord = null;
		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr);) {

			String line = br.readLine();
			while (line != null) {

				if (countVowels(line) == 2) {
					finalWord = line;
				}
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			return "Please give the correct file name";
		} catch (IOException e) {
			return "Error occurred while reading the names from file";
		}
		return finalWord;

	}

	private int countVowels(String name) {
		int count = 0;

		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		return count;

	}


	public static void main(String args[]) {

		UserInterface ut = new UserInterface();
		String fileName="inputfeed.txt";
		String s=ut.findPetName(fileName);
		System.out.println(s);		
	}

}
