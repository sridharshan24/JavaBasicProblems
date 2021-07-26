package com.accenture.problems;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class RepeatedCharacterOfAString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:::::");
		String str = sc.next();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i =0 ; i< str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				int count = hm.get(str.charAt(i));
				count++;
				hm.put(str.charAt(i), count);
			}
			else
				hm.put(str.charAt(i), 1);
		}
		for(Entry<Character, Integer> entry: hm.entrySet())
		{
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}

	}

}
