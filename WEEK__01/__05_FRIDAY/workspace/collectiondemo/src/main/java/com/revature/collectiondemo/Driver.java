package com.revature.collectiondemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Driver {
	
	public static void main(String[] args) {
		
		Iterable<Integer> myIterable;
		List<Integer> myList = new LinkedList<Integer>();
		
		myList.add(3);
		myList.add(4);
		
		System.out.println(myList);
		
		Iterator<Integer> myIterator = myList.iterator();
		System.out.println(myIterator.next());
		
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		System.out.println(myList.toString());
		
		Map<String, Exception> exceptionMap = new HashMap<String, Exception>();
		
		exceptionMap.put("Trying to access index that doesn't exist", new ArrayIndexOutOfBoundsException());
		
		exceptionMap.put("Something went wrong while working with files", new IOException());
		
		System.out.println(exceptionMap);
		System.out.println(exceptionMap.get("Trying to access index that doesn't exist"));
		System.out.println(exceptionMap.get("wrong key"));
		
		PriorityQueue<String> myPriorityQueue= new PriorityQueue<String>();
		ArrayList<String> myArrayList = new ArrayList<String>();
		
	}
	
}
