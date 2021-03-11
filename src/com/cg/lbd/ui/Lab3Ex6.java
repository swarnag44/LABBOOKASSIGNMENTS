package com.cg.lbd.ui;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Ex6 {
		// TODO Auto-generated method stub
		public static boolean checkString(String str) {
			int size = str.length();  
		      char[] chArray = new char[size];  
		      for(int a = 0; a < size; a++){  
		         chArray[a] = str.charAt(a);  
		      }  
		     Arrays.sort(chArray);
		      for(int a = 0; a < size; a++){
		         if(chArray[a] != str.charAt(a)){
		            return false;
		         }
		      }                
		      return true;      
		}
		
		public static void main(String[] args) {
			System.out.println("enter string");
			Scanner sc=new Scanner (System.in);
			String str=sc.nextLine();
			System.out.println("this String is in alphabetic order: "+checkString(str));
			sc.close();

	}

}
