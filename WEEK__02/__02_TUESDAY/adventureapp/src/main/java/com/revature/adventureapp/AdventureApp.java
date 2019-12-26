package com.revature.adventureapp;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.mavenproject.adventure.controllers.RoomController;
import com.mavenproject.adventure.model.Grid;

public class AdventureApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<List<Room>> test = new ArrayList<List<Room>>();
		test.add(new ArrayList<Room>());
		
		test.get(0).get(3);
		
		Boolean hasGivenValidInput = false;
		
		String roomOnePrompt = "You find yourself in a laboratory.";
		String roomTwoPrompt = "You find yourself in a library.";
		String roomThreePrompt = "You find yourself in a forest.";
		
		Set<String> roomOneOptions = new HashSet<String>(Arrays.asList(
				"NORTH",
				"SOUTH"
				));
		
		Set<String> roomTwoOptions = new HashSet<String>(Arrays.asList(
				"SOUTH"
				));
		
		Set<String> roomThreeOptions = new HashSet<String>(Arrays.asList(
				"NORTH",
				"SOUTH",
				"EAST",
				"WEST"
				));
		
		Room roomOne = new Room(roomOneOptions, roomOnePrompt);
		Room roomTwo = new Room(roomTwoOptions, roomTwoPrompt);
		Room roomThree = new Room(roomThreeOptions, roomThreePrompt);
		
		Grid adventure = new Grid();
		for (int i=0; i < 5; i++) {
			for (int j=0; j<5; j++) {
				adventure.add(roomThree, i, j);
			}
		}
		
		adventure.add(roomTwo,  2,  3);
		adventure.add(roomTwo,  1,  3);
		adventure.add(roomTwo,  3,  1);
		
		adventure.add(roomOne,  2,  2);
		adventure.add(roomOne,  4,  4);
		
		GridService gs = new GridService(adventure, new Point(3, 3), roomController);

		
		
	}

} // END public class AdventureApp
