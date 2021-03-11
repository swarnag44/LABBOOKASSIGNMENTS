package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab2Ex2 {
	public static String[] sortStrings(String []arr){
		String temp;
		for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) { 
                if (arr[i].compareTo(arr[j])>0) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		for(int p=0;p<arr.length;p++) {
			if(arr.length%2!=0) {
				for(int j=0;j<(arr.length/2)+1;j++) {
						arr[j]=arr[j].toUpperCase();
			}
			}else {
				for(int j=0;j<arr.length/2;j++) {
					arr[j]=arr[j].toUpperCase();
				}
			}if(arr.length%2!=0) {
			for(int i=(arr.length/2)+1;i<arr.length;i++) {
			arr[i]=arr[i].toLowerCase();
			}
			}else {
				for(int i=arr.length/2;i<arr.length;i++) {
					arr[i]=arr[i].toLowerCase();
				}
			}
		}
		return arr; 
	}
	public static void main(String [] args) {
		System.out.println("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String [] arr=new String[n];
		Scanner sc2 = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			arr[i]=sc2.nextLine();
		}
		String[] v=sortStrings(arr);
		System.out.println("Elements are:");
		 for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
		sc.close();
	}

}
