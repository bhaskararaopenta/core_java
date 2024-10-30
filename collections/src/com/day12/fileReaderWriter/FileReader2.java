package com.day12.fileReaderWriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\core_java_workspace\\collections\\src\\sample.txt");
			int ch = fr.read();
			while (ch != -1) {
				System.out.println((char) ch);
				ch=fr.read();
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}