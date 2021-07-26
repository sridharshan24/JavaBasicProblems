package com.accenture.problems;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find it is prime or not::::");
		
		int n = sc.nextInt();
		boolean flag = true;
		for (int i=2 ; i<= Math.sqrt(n)+1;i++)
		{
			if(n % i == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("It is Prime");
		}else
		{
			System.out.println("It is not a prime");
		}
	}

}
