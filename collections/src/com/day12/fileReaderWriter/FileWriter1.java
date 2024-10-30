package com.day12.fileReaderWriter;

import java.io.FileWriter;

public class FileWriter1 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("C:\\core_java_workspace\\collections\\src\\Writer.txt");) {
			fw.write(100);
			fw.write("\n");
			fw.write("hello");
			fw.write("\n");
			fw.write('c');
			fw.write("\n");
			char ch[] = { 'a', 'b', 'c', 'd', 'e' };
			fw.write(ch);
			fw.write("\n");
			fw.write("100"); 
			fw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}	
}