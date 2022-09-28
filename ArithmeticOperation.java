package com.Bridgelabz.Day2;

public class ArithmeticOperation {
	public static void main(String[] args) {
		int a = 30;
		int b = 10;
		int c = 20;
		int oper1, oper2, oper3, oper4;
		oper1 = a + b * c;
		oper2 = c + a / b;
		oper3 = a % b + c;
		oper4 = a * b + c;

		if (oper1 > oper2 && oper1 > oper3 && oper1 > oper4) {
			System.out.println("Operation = a+b*c is greater than other operation");
		} else if (oper2 > oper1 && oper2 > oper3 && oper2 > oper4) {
			System.out.println("Operation = c+a/b is greater than other operation");
		} else if (oper3 > oper1 && oper3 > oper2 && oper3 > oper4) {
			System.out.println("Operation = a%b+c is greater than other operation");
		} else {
			System.out.println("Operation =  a*b+c is greater than other operation");
		}
	}
}
