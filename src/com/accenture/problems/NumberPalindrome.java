package com.accenture.problems;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:::::");
		int number = sc.nextInt();
		int number2 = number;
		int remainder = 0;
		int reverse = 0;
		while(number != 0)
		{
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number/10;
		}
		System.out.println("The reversed number is :::::::"+ reverse);
		if(reverse == number2)
			System.out.println("It is palindrome");
		else
			System.out.println("It is not a palindrome");
		
		

	}

}
