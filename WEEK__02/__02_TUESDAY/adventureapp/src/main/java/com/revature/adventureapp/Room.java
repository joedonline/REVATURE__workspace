package com.revature.adventureapp;

import java.util.HashSet;
import java.util.Set;

import com.mavenproject.adventure.exceptions.InvalidOptionException;

/**
 * 
 * Represents a room in a Choose-Your-Own-Adventure
 * 
 * Holds state for the test description of the Room and available options
 * 
 * @author Joe
 *
 */
public class Room {
	
	/**
	 * A list of uppercase Strings that contains all available options in the Room
	 */
	private Set<String> options;
	/**
	 * The text prompt associated with entering the Room
	 */
	private String prompt;
	
	
	public Room(Set<String> options, String prompt) {
		super();
		this.setOptions(options);
		this.prompt = prompt;
	}
	
	public String choose(String option) {
		if (isValidOption(option)) {
			return option;
		} else {
			throw new InvalidOptionException();
		}
	}
	
	public boolean isValidOption(String option) {
		return option.contains(option.toUpperCase());
	}

	public Set<String> getOptions() {
		return options;
	}
	
	/**
	 * Converts a list of options to all uppercase and sets them on the Room
	 * 
	 * @param options
	 */
	public void setOptions(Set<String> options) {
		Set<String> uppercaseOptions = new HashSet<String>();
		for (String s : options) {
			uppercaseOptions.add(s.toUpperCase());
		}
		this.options = uppercaseOptions;
	}
	
	public String getPrompt() {
		return prompt;
	}
	
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	@Override
	public String toString() {
		return "Room [options=" + options + ", prompt=" + prompt + ", getOptions()=" + getOptions() + ", getPrompt()="
				+ getPrompt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
