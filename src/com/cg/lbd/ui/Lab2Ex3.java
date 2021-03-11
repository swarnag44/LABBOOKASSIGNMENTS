package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab2Ex3 {
	public static int[] getSorted (int [] a) {
		int j= a.length-1;
		int b[]=new int[j];
		for ( int i = a.length-1 ; i>=0 ; i-- ){
			b[j]=a[i];
		} 
		return b;
	    
	}

	    public static void main(String[] args) 
	    {
	        int a[]=new int[5];
	         Scanner input=new Scanner(System.in);
	         System.out.println("Enter five array elements: ");
	         for(int i=0;i<a.length;i++){
	             a[i]=input.nextInt();
	         }
	         int array[]=getSorted(a);
	         System.out.println("Array In Reverse Order: ");
	         for(int i=0;i<array.length;i++){
	             System.out.println(array[i]);
	         }
	    }

}
