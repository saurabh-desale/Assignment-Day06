package com.blz.practiceproblem.day06.UC2;

import java.util.Scanner;

public class UC2_Perfect_Number {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		int i, Num, Sum = 0;
		System.out.println("Enter a number: ");
		Num = SC.nextInt();
		for (i = 1; i < Num; i++) {
			if (Num % i == 0) {
				Sum = Sum + i;

			}

		}
		if (Sum == Num) {
			System.out.println(Num + " is a pefect number");

		} else {
			System.out.println(Num + " is not a perfect number");
		}
	}

}
