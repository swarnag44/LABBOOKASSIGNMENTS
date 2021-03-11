package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab1Ex5 {
	public  int calculateSum(int n){
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}else{
				continue;
			}
		}
		return sum;
	}
	public static void main(String [] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Lab1Ex5 obj=new Lab1Ex5();
		//System.out.println("sum is:"+calculateSum(n));
		System.out.println(obj.calculateSum(n));
		sc.close();
	}
}
