package com.dharmu.jlc.enum1;
import java.util.*;
public class Lab6 {

	public static void main(String[] args) {
		Set <Direction6> set = EnumSet.allOf(Direction6.class);
		System.out.println(set);
		Map<Direction6, Integer> map = new EnumMap<>(Direction6.class);
		map.put(Direction6.EAST, 0);
		map.put(Direction6.NORTH, 90);
		map.put(Direction6.WEST, 180);
		map.put(Direction6.SOUTH, 270);
		System.out.println(map);
		
	}

}
enum Direction6{
	EAST, WEST, NORTH, SOUTH
	}