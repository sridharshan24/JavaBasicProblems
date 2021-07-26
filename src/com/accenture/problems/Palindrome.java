package com.accenture.problems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:::::");
		String str = sc.next();
		boolean flag = false;
		int len = str.length()-1;
		for(int i=0; i< str.length()/2;i++)
		{
			if(str.charAt(i) == str.charAt(len-i))
			{
				flag = true;
			}
			else
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("It is palindrome");
		else
			System.out.println("It is not a palindrome:::::::");

	}

}
