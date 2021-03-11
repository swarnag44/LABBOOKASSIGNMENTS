package com.cg.lbd.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab2Ex4 {
	public static void modifyArray(int[] array) {
		String[] arrayNew = new String[array.length];
		int iterator = 0;
		for (iterator = 0; iterator < array.length; iterator++) {
			arrayNew[iterator] = String.valueOf(array[iterator]);
		}
		Set<String> set = new HashSet<>(Arrays.asList(arrayNew));
		ArrayList<String> list = new ArrayList<String>(set);

		Collections.sort(list, Collections.reverseOrder());
		for (iterator = 0; iterator < list.size(); iterator++) {
			System.out.println(list.get(iterator));
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scanner.nextInt();
		int[] array = new int[number];
		int iterator;
		System.out.println("enter the elements");
		scanner.nextLine();
		for (iterator = 0; iterator < number; iterator++) {
			array[iterator] = scanner.nextInt();
		}
		scanner.close();

		modifyArray(array);

	}

}
