package com.day12.fileReaderWriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\PENRAO\\Desktop\\fileReader\\simple.txt");
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
