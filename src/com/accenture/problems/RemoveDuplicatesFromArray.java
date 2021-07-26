package com.accenture.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {

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
		List<Integer> list = new ArrayList<>();
		for(int i =0; i< number.length;i++)
		{
			list.add(number[i]);
		}
		Set<Integer> lh = new LinkedHashSet<Integer>(list);
		System.out.println(lh);

	}

}
