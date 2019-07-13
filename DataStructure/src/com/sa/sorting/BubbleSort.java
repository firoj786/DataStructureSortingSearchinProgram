package com.sa.sorting;
import java.util.Scanner;
//Bubble sort Algorithm:
class BubbleSort {
	public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements into array :");
		int a[] = new int[50];
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
			}
		System.out.println("Before sorting:");
		for (int i = 0; i < 10; i++) {
			System.out.print("\t"+a[i]);
		}
		System.out.println("\t");
		BubbleSort(a,10);
	}
static void BubbleSort(int a[], int n) {
		int temp;
		for (int i = 0; i < (n - 1); ++i) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After Sorting:");
		for (int i = 0; i < 10; i++) {
			System.out.print("\t"+a[i]);
		}

	/*	for (int j = 0; j < array_size - 1 - i; ++j )
		{
		     if (a[j] > a[j+1])
		     {
		          temp = a[j+1];
		          a[j+1] = a[j];
		          a[j] = temp;
		          System.out.println("\t"+a[j]);
		     }
		     }*/
		    
		}
}

