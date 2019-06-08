package com.java.collections;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class ArrayListExample {

	public static void main(String... args) {
		System.out.println("Create a ArrayList with String type"); 
		ArrayList<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		
		System.out.println("================================================================");
		System.out.println("Print the list");
		System.out.println(list.toString());
		
		System.out.println("================================================================");
		System.out.println("Print the first object");
		System.out.println(list.get(0));
		
		System.out.println("================================================================");
		System.out.println("Cloning the Object and print the cloned one");
		ArrayList<String> clonedList = (ArrayList<String>) list.clone();
		System.out.println(clonedList.toString());
		
		System.out.println("================================================================");
		System.out.println("Adding a fourth element into a list and print all");
		list.add("Fourth");
		System.out.println(list.toString());
		System.out.println(clonedList.toString());
		
		System.out.println("================================================================");
		System.out.println("Clear the cloned list. Should return empty");
		clonedList.clear();
		if (clonedList.isEmpty()) {			
			System.out.println(list.toString());
			System.out.println(clonedList.toString());
		}
		
		System.out.println("================================================================");
		System.out.println("Removed an element");
		list.remove("Second");
		System.out.println(list.toString());
		
		System.out.println("================================================================");
		System.out.println("Removed an element while iterate will throw concurrent modification exception");
		try{
			
			list.forEach(number -> {
				System.out.println(number);
				list.remove("Fourth");
			});
		} catch(ConcurrentModificationException e) {
			e.printStackTrace();
		}
		
		System.out.println("================================================================");
		System.out.println("Get index of a element");
		System.out.println(list.indexOf("First"));
		
		System.out.println("================================================================");
		System.out.println("Add another list into the current one");
		ArrayList<String> newList = new ArrayList<String>();
		newList.add("Fifth");
		list.addAll(newList);
		System.out.println(list.toString());
	}
}
