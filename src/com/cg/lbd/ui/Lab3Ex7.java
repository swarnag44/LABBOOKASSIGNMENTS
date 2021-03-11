package com.cg.lbd.ui;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab3Ex7 {
	public static void getDuration(Object d1){
		LocalDate currentdate=LocalDate.now();
		Period period=Period.between((LocalDate) d1, currentdate);
		//System.out.println(" Days  Months  Years" +period);
		System.out.printf(" %d Days %d Months %d Years" ,period.getDays(),period.getMonths(),period.getYears());
	}

	public static void main(String[] args) throws ParseException {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter date");
		String strDoj=scan.next();
		LocalDate obj=LocalDate.parse(strDoj);
		getDuration(obj);
		scan.close();
	}

}
