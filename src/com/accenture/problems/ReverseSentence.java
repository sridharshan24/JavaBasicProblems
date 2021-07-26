package com.accenture.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence:::::");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		List<String> list = new ArrayList<>();
		String sb = new String();
		for(int i=0;i< str.length();i++)
		{
			if(ch[i]!= ' ')
			{
				sb = sb + str.charAt(i);
			}
			else
			{
				list.add(sb);
				sb = "";
			}	
		}
		list.add(sb);
		String[] array = list.toArray(new String[list.size()]);
		StringBuilder sb1 = new StringBuilder();
		for(int i=array.length - 1; i>=0;i--)
		{
			sb1.append(array[i]);
			sb1.append(' ');
		}
		System.out.println("The reversed Sentence is :::" + sb1);

	}

}
