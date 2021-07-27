package com.accenture.problems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:::::");
		int size = sc.nextInt();
		
		int[] number = new int[size];
		int[] factorial = new int[size];
		System.out.println("Enter the numbers:::::");
		for(int i =0;i< size;i++)
		{
			number[i] = sc.nextInt();
		}
		
		for(int i=0;i< size;i++)
		{
			int fact = 1;
			for(int j = number[i]; j>0;j--)
			{
				fact = fact * j;
			}
			factorial[i] = fact;
			System.out.println("The factorial is::::::::::"+factorial[i]);
		}
	}

}
