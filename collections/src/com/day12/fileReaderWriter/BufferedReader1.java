package com.day12.fileReaderWriter;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader1 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:\\Users\\PENRAO\\Desktop\\fileReader\\simple.txt");
				BufferedReader br = new BufferedReader(fr);

		) {
//			System.out.println("reading letter by letter");
//			int ch = br.read();
//			while (ch != -1) {
//				System.out.println((char)ch);
//				ch = br.read();
//			}

			System.out.println("reading line by line");
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
