package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab3Ex3 {
	public static String replaceConsonants(String s){
   	 StringBuffer sbuffer=new StringBuffer(s);
   	 for(int i=0; i < s.length(); i++){
   		    char inputChar = s.charAt(i);

   		    String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
   		    for(int j = 0; j < consonants.length(); j++){
   		       char stringChar = consonants.charAt(j);

   		        if(inputChar == stringChar){
   		        	//s[i]++;
   		        }
   } 
	return s;
   } 
   //public static void main(String[] args) 
   { 
   	System.out.println("enter string:");
   	Scanner sc=new Scanner(System.in);
   	//String s = sc.nextLine();
   	
       System.out.print("Enter any string = ");
       System.out.println(replaceConsonants(s)); 
	 

	    }
   		return s;

	}

}
