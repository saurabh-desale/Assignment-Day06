package com.blz.practiceproblem.day06.UC4;

import java.util.Scanner;

public class UC4_ReverseNumber {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
        int num=SC.nextInt(),reverse=0;
            while(num!=0) {
            	int remainder=num%10;
            	reverse=reverse*10+remainder;
            	num=num/10;
            }
        System.out.println("The reverse of the given number is : "+reverse);
        
	}

}
