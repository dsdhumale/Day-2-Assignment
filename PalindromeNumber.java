package com.Bridgelabz.Day2;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number want to check Palindrome Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num1 = number;
		int reverse = 0;

		for (; number != 0; number = number / 10) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println(num1 == reverse);

	}
}
