package com.day12.fileReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter1 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("C:\\core_java_workspace\\collections\\src\\TempBufferedWriter.txt");
				BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(100);
			bw.write("\n");
			bw.write("hello");
			bw.write("\n");
			bw.write('c');
			bw.write("\n");
			char ch[] = { 'a', 'b', 'c', 'd', 'e' };
			bw.write(ch);
			bw.write("\n");
			bw.write("100");
			bw.write("\n");
			bw.write("hello my name is bhaskar");
			bw.write("\n");
			bw.write("hello my name is bhaskar");
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
