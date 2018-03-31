package com.javaPractice.lambda;

public class PracticeProgramSerise {

	public static void bBSort(int[] a) {

		int n = a.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 1; j < n - i; j++) {
				System.out.println(n - i);
				if (a[j - 1] > a[j]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;

				}

			}
		}

	}

	public static void main(String[] args) {

		int a[] = { 4, 3, 1, 4, 8, 4, 6, 3, 4, 9, 6, 8, 3 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

		System.out.println("sorted: \n");

		bBSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

	}

}
