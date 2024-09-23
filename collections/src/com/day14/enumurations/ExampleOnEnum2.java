package com.day14.enumurations;

enum Colors{
	RED,BLUE,GREEN
}
public class ExampleOnEnum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Colors cs = Colors.BLUE;
		switch (cs) {
		case RED:
			System.out.println("The color is red");
			break;

		case BLUE:
			System.out.println("The color is blue");
			break;
			
		case GREEN:
			System.out.println("The color is green");
			break;
		}
		System.out.println("printing by index using ordinal method");
		
		int index = cs.ordinal();
		switch (index) {
		case 0:
			System.out.println("The color is red");
			break;

		case 1:
			System.out.println("The color is blue");
			break;
		case 2:
			System.out.println("The color is green");
			break;
		
		}
	}

}
