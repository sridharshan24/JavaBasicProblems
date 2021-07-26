package com.accenture.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatedCharacterFromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:::::");
		String str = sc.next();

		HashMap<Character, Integer> lm = new HashMap<>();
		
		for(int i=0; i<str.length();i++)
		{
			if(lm.containsKey(str.charAt(i)))
				lm.put(str.charAt(i), lm.get(str.charAt(i))+1);
			else
				lm.put(str.charAt(i), 1);
		}
		
		for(Entry<Character, Integer> entry: lm.entrySet())
		{
			if(entry.getValue() == 1)
			{
				System.out.println("The first non-repeated character is:::::::::" + entry.getKey());
				break;
			}
		}
	}

}
