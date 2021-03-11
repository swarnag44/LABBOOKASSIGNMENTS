package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab1Ex7 {
	public static boolean checkNumber(int number){
		int currentDigit = number % 10;
	    number = number/10;
	    while(number>0){
	    	if(currentDigit <= number % 10){
	    		
	    		return false;
	        }
	    	currentDigit = number % 10;
	    	number = number/10;
	    }
		return true;
	}
	public static void main(String [] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("sum is:"+checkNumber(number));
		sc.close();
	}
}
