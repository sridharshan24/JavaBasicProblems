package com.accenture.problems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:::::");
		int size = sc.nextInt();
		
		int[] number = new int[size];
		System.out.println("Enter the numbers:::::");
		for(int i =0;i< size;i++)
		{
			number[i] = sc.nextInt();
		}
		
		for(int i=0;i<number.length/2;i++)
		{
			int temp = number[i];
			number[i] = number[number.length -1 - i];
			number[number.length -1 - i] = temp;
		}
		System.out.println(Arrays.toString(number));
	}

}
