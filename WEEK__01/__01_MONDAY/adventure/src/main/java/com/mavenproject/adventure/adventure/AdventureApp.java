package com.mavenproject.adventure.adventure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.mavenproject.adventure.controllers.RoomController;

public class AdventureApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Boolean hasGivenValidInput = false;
		
		String roomOnePrompt = "You find yourself in the laboratory.";
		String roomTwoPrompt = "You find yourself in the library.";
		
		Set<String> roomOneOptions = new HashSet<String>(Arrays.asList(
				"NORTH",
				"SOUTH"
				));
		
		Set<String> roomTwoOptions = new HashSet<String>(Arrays.asList(
				"SOUTH"
				));
		
		Room roomOne = new Room(roomOneOptions, roomOnePrompt);
		Room roomTwo = new Room(roomTwoOptions, roomTwoPrompt);
		
		while(!hasGivenValidInput) {
			
			System.out.println(roomOne.getPrompt());
			System.out.println("Options: " + roomOne.getOptions());
			
			String userInput = sc.nextLine();
			
		}
		
		RoomController roomComtroller = new RoomController();
		roomComtroller.setRoom(roomOne);
		roomComtroller.enter();
		System.out.println(RoomController.acceptOptionFromUser());
	}

} // END public class AdventureApp
