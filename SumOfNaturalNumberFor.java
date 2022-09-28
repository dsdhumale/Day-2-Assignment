package com.Bridgelabz.Day2;

import java.util.Scanner;

public class SumOfNaturalNumberFor {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int number = num.nextInt();
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		System.out.println("Natural number sum is till : " + number + " is " + sum);

	}
}
