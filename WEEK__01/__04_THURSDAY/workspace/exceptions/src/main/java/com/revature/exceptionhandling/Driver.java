package com.revature.exceptionhandling;

import java.io.IOException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Driver {

	public static void main(String[] args) {
		
		// single line comment
		
		/*
		 * multiline comment
		 */
		
		/**
		 * This is a javadoc comment
		 */
		// new java.nio.file.FileSystemLoopException("some file"); 
		
		try {
			Files.createDirectory(Paths.get("thisUriWillFail"));
		} catch (FileSystemLoopException e) {
			System.err.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			
		} finally {
			System.out.println("This always run");
		}

	}

}
