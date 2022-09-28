package com.Bridgelabz.Day2;

import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args) {
		Scanner digit = new Scanner(System.in);
		System.out.println(" Enter the digit ");
		int singleDigit = digit.nextInt();
		if (singleDigit == 0) {
			System.out.println("Zero");
		} else if (singleDigit == 1) {
			System.out.println("One");
		} else if (singleDigit == 2) {
			System.out.println("Two");
		} else if (singleDigit == 3) {
			System.out.println("Three");
		} else if (singleDigit == 4) {
			System.out.println("Four");
		} else if (singleDigit == 5) {
			System.out.println("Five");
		} else if (singleDigit == 6) {
			System.out.println("Six");
		} else if (singleDigit == 7) {
			System.out.println("Seven");
		} else if (singleDigit == 8) {
			System.out.println("Eight");
		} else if (singleDigit == 9) {
			System.out.println("Nine");
		} else
			System.out.println("Entered digit is not single digit no");
	}
}
