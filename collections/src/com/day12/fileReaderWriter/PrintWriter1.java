package com.day12.fileReaderWriter;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("C:\\core_java_workspace\\collections\\src\\TempPrintWriter.txt");
				PrintWriter pw = new PrintWriter(fw);) {

			pw.println("welcome to java");
			pw.println(100); // integer
			pw.write(100); // d
			pw.println("");
			pw.println(true);
			char ch[] = { 'a', 'b', 'c', 'd', 'e' };
			pw.println(ch);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
