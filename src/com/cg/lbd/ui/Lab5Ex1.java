package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab5Ex1 extends Exception{
	public static void main(String [] args) { //throws Exception{
		System.out.println("Enter Age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			if(age>=15) {
				System.out.println(age);
			}else {
				throw new Exception("Invalid Age");
			}
		}catch(Exception e) {
			System.out.println("Age should be 15 or above");
		}
		sc.close();
	}

}
