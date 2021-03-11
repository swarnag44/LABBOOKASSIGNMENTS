package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab3Ex4 {

	public static int modifyNumber(int s) {
		String str=String.valueOf(s);
		int di,di2,diff = 0,f=0;
		String str1 = null;
		 StringBuffer sb=new StringBuffer();
		char ch,ch2;
		for(int i=0;i<str.length()-1;i++) {
			ch=str.charAt(i);
			di = Character.getNumericValue(ch);
		    ch2 = str.charAt(i + 1);
		    di2 = Character.getNumericValue(ch2);
		    diff = Math.abs(di - di2);
		   
	        sb.append(diff);
		
		}
		str1 = sb.toString();
		str1=str1+str.charAt(str.length()-1);
		f=Integer.parseInt(str1);
		return f;
	}
	public static void main(String[] args) {
		System.out.println("enetr");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(modifyNumber(n));
	}
}
