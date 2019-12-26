package com.mavenproject.adventure.controllers;

import java.util.Scanner;

import com.revature.adventureapp.Room;

/**
 * Responsible for user input/output on the console for a given Room
 * 
 * @author Revature
 *
 */
public class RoomController {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static Room room;
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void enter() {
		System.out.println(room.getPrompt());
		System.out.println("Options: " + room.getOptions());
	}
	
	/**
	 * Accepts user input with retry logic
	 * 
	 * @return
	 */
	public static String acceptOptionFromUser() {
		Boolean valid = false;
		String userInput = null;
		
		while (!valid) {
			userInput = sc.nextLine();
			valid = room.isValidOption(userInput);
			if (!valid) {
				System.out.println("Invalid option");
			}
		}
		
		return userInput;
		
	}

}
