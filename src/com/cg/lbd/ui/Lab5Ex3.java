package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab5Ex3{

	public static void main(String[] args) throws EmployeeException {
		System.out.println("enter salary");
		Scanner sc=new Scanner(System.in);
		try {
		int salary=sc.nextInt();
			if(salary<3000) {
				throw new EmployeeException("innvalid");
			}
			System.out.println(salary);
		}catch (EmployeeException s) 
        { 
            System.out.println(" salary must be greater than 3000"); 
        } 
		sc.close();
	}
}
