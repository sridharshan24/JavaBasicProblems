package com.accenture.problems;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n::::::");
		int n = sc.nextInt();
		int x = 1;
		int y = 1;
		int ans = 0;
		System.out.print(x + "    ");
		System.out.print(y + "    ");
		for (int i=0;i<n;i++)
		{
			ans = x + y;
			x = y;
			y = ans;
			System.out.print(ans + "    ");
		}

	}

}
