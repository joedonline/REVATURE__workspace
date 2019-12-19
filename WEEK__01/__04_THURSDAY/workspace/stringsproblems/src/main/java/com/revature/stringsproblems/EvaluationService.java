package com.revature.stringsproblems;

import java.util.Arrays;
import java.util.List;

public class EvaluationService {

	public static void main(String[] args) {
		System.out.println(acronym("      Portable    Network  Graphics"));
		System.out.println(getScrabbleScore("Cabbage"));
		System.out.println(cleanPhoneNumber("1 (634) 554 - 4928"));
		System.out.println(cheekyStringLength("hello!"));
	}

	/**
	 * 1. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 *
	 * @param phrase
	 * @return
	 */
	public static String acronym(String phrase) {

		String acronym = "";

		// Sanitize phrase arr
		String phrases[] = phrase.trim().split(" ");

		// Extract phrases
		for (String item : phrases) {

			// Get firstChar of phrase
			if (!item.isBlank()) {

				char c = item.charAt(0);
				acronym += String.valueOf(Character.toString(c));

			}

		}

		// Build firstChars to acronym
		System.out.println(acronym);
		return acronym;
	}

	/**
	 * 2. Given a word, compute the scrabble score for that word.
	 *
	 * --Letter Values-- Letter Value
	 * A, E, I, O, U, L, N, R, S, T = 1;
	 * D, G = 2;
	 * B, C, M, P = 3;
	 * F, H, V, W, Y = 4;
	 * K = 5;
	 * J, X = 8;
	 * Q, Z = 10;
	 *
	 * Examples
	 * "cabbage" should be scored as worth 14 points:
	 *
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 *
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 *
	 * @param string
	 * @return
	 */
	public static int getScrabbleScore(String string) {
		//implement here
		List<String> onePt = Arrays.asList(new String[]{"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"});
		List<String> twoPt = Arrays.asList(new String[]{"D", "G"});
		List<String> threePt = Arrays.asList(new String[]{"B", "C", "M", "P"});
		List<String> fourPt = Arrays.asList(new String[]{"F", "H", "V", "W", "Y"});
		List<String> fivePt = Arrays.asList(new String[]{"K"});
		List<String> eightPt = Arrays.asList(new String[]{"J", "X"});
		List<String> tenPt = Arrays.asList(new String[]{"Q", "Z"});

		int points = 0;


		String strings[] = string.trim().split("");

		for (String s : strings) {

			if (onePt.contains(s.toUpperCase())) {
				// add to points
				points += 1;
			} else if (twoPt.contains(s.toUpperCase())) {
				System.out.println(s.toUpperCase());
				// add to points
				points += 2;
			} else if (threePt.contains(s.toUpperCase())) {
				System.out.println(s.toUpperCase());
				// add to points
				points += 3;
			} else if (fourPt.contains(s.toUpperCase())) {
				System.out.println(s.toUpperCase());
				// add to points
				points += 4;
			} else if (fivePt.contains(s.toUpperCase())) {
				System.out.println(s.toUpperCase());
				// add to points
				points += 5;
			} else if (eightPt.contains(s.toUpperCase())) {
				System.out.println(s.toUpperCase());
				// add to points
				points += 8;
			} else {
				System.out.println(s.toUpperCase());
				// is ten, add to points
				points += 10;
			}

		}

		return points;
	}

	/**
	 * 3. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 *
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 *
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 *
	 * The format is usually represented as
	 *
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 *
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 *
	 * For example, the inputs
	 *
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 *
	 * 6139950253
	 *
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public static String cleanPhoneNumber(String string) {
		//implement here
		String sanitized = string.replaceAll("[-() ]", "");

		return sanitized.substring(1);
	}

	/**
	 * 4. String length workaround
	 *
	 * This problem is a little different.  Write a method that
	 * returns the length of a String without ever calling
	 * str.length().
	 *
	 * Your solution may be messy.
	 */
	public static int cheekyStringLength(String str) {

		int length = 0;

		for (String c : str.trim().split("")) {
			length += 1;
		}

		return length;
	}

}
