package com.upskill.java_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {
	
	private static final String Dhaka = null;

	public static void main(String[] args) {
		int age = 30;
		int [] ageFalcon = new int []{25, 30, 28, 35, 40};
		
		System.out.println("student Age : " + ageFalcon[2]);
		System.out.println("Total stsuden : " + ageFalcon.length);
		
	String[] nameFalcon = new String[] {"Rony", "Rassel", "Salman",};
		
		System.out.println(nameFalcon.length);
		System.out.println(nameFalcon[0]);
		System.out.println(Arrays.toString(nameFalcon));
		
		boolean[] attendanceFalcon = new boolean[] {true, false, false, true, true};
		System.out.println("Lenth of an Array is: " + attendanceFalcon.length);
		System.out.println(" Total stsudent : " + attendanceFalcon[0]);
		
		
		
		int[][] ageFalcon2D =  {{25, 30, 28, 35, 40},
			                  	{24, 28, 32, 22,}};
		
		System.out.println("student Age 2D : " + ageFalcon2D[0][3]);
		
		HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
		
		StudentAge.put("Tahmid" , 25);
		StudentAge.put("Lubna" , 24);
		StudentAge.put("Salman" , 27);
		StudentAge.put("Rumi" , 35);
		StudentAge.put("Sumiya" , 25);
		
		System.out.println("Hashmap Student Age : " + StudentAge.get("Lubna"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washingtion DC");
		System.out.println("Hashmap Capital : " + Capital.get("BD"));
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Hashtable Region : " + Region.get("BD"));
		
		HashSet<String> car = new HashSet<>();
		car.add("BMW");
		car.add("TESLA");
		car.add("AUDI");
		car.add("FORD");
		System.out.println("car : " + car);
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

