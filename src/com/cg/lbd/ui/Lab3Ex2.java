package com.cg.lbd.ui;

import java.util.Scanner;

public class Lab3Ex2 {

	public static String getImage(String s) {
		StringBuffer sbuffer=new StringBuffer(s);
		sbuffer.reverse();
		String se=s+"|"+sbuffer;
		return se;
	}
	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(getImage(s));
		sc.close();

	}

}
