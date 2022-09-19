package com.P3;

import java.util.Random;

public class StaticMethod {
	public static int a[] = new int[10];

	static {
		System.out.println("Getting executed");
		Random rnd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt();
		}
	}
		
		public void listValues() {
			System.out.println("The elements are");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + ", ");
			}
			System.out.println();
		}
}
