package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab1Ex6 {
	public static  int calculateDifference(int n){
		int l = (n * (n + 1) * (2 * n + 1)) / 6; 
		int k = (n * (n + 1)) / 2;  
	    k = k * k;
		int sum = Math.abs(l-k); 
		return sum;
	}
	public static void main(String [] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("sum is:"+calculateDifference(n));
		sc.close();
	}
}
