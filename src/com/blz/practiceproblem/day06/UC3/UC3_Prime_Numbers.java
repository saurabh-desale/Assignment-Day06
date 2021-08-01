package com.blz.practiceproblem.day06.UC3;

import java.util.Scanner;

public class UC3_Prime_Numbers {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		int num, flag = 0, half;
		System.out.println("Please enter your number: ");
		num = SC.nextInt();
		half = num / 2;
		if (num == 0 || num == 1) {
			System.out.println("It is not a prime number");

		}
		for (int a = 2; a <= half; a++) {

			if (num % a == 0) {
				 System.out.println("It is not a prime number");
				flag = 1;
				break;
			}
		}

		if (flag == 0) {

			System.out.println("It is a prime number");
		}
	}
}
