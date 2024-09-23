package com.day14.enumurations;


enum Directions{
	EAST,WEST,NORTH,SOUTH
}
public class EnumOnDirections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directions d = Directions.EAST;
		System.out.println(d);
		
		int position = d.ordinal();
		System.out.println(position);

	}

}
