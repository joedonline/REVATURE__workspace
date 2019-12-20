package com.revature.stringsproblems;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvaluationServiceTest {
	
	ArrayList<String> myArrayList = new ArrayList<String>();
	
	private static EvaluationService evaluationService;
	
	@Test
	public void acronymReturnsPng() {
		String output = evaluationService.acronym("Portable Network Graphics");
		assertTrue(output.equalsIgnoreCase("PNG"));
	}
	
	@Test
	public void acronymHandlesCapitalization() {
		String output = EvaluationService.acronym("portable network graphics");
		assertTrue(output.equals("PNG"));
	}
	
	@Test
	public void scrabbleScoreTalliesCabbage() {
		int output = EvaluationService.getScrabbleScore("Cabbage");
		assertEquals(output, 14);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void breakingStringThrowsException() {
		int output = evaluationService.cheekyStringLength("breakingstring");
	}
	
	@Before
	public void setUp() {
		evaluationService = new EvaluationService();
	}
	
	@After
	public void tearDown() {
		evaluationService = null;
	}
	
}
