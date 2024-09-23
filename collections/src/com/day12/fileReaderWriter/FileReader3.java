package com.day12.fileReaderWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader3 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:\\core_java_workspace\\collections\\src\\sample.txt");) {

			int ch = fr.read();
			while (ch != -1) {
				System.out.println((char) ch);
				ch = fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
