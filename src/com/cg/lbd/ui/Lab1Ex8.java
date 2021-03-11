package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab1Ex8 {
	public static boolean checkNumber(int n){
		while(n%2==0){
			n=n/2;
		}
		if(n==1) {
			return true;
		}
		return false;
	}
	public static void main(String [] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("sum is:"+checkNumber(n));
		sc.close();
	}
}
