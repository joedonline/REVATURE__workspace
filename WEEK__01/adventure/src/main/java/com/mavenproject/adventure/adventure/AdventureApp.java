package com.mavenproject.adventure.adventure;

import java.util.Scanner;

public class AdventureApp {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Boolean hasGivenValidInput = false;
		
		while (!hasGivenValidInput) {
			System.out.println("Enter the text stringexample: ");
			String userString = sc.next();
			if (userString .equalsIgnoreCase("stringexample")) {
				System.out.println("It works!!");
				hasGivenValidInput = true;
			} else {
				System.out.println("It didn't work.");
			}
		}
	}

} // END public class AdventureApp
