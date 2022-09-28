package com.Bridgelabz.Day2;

import java.util.Scanner;

public class SumOfNaturalWlile {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int number = num.nextInt();
		int i = 0;
		int sum = 0;
		while (i <= number) {
			sum += i;
			i++;
		}
		System.out.println("Natural number sum is " + sum);

	}

}
