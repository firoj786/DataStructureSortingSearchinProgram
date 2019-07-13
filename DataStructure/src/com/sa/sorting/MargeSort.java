package com.sa.sorting;

import java.util.Scanner;

//Merge Sort Algorithm :
class MargeSort {
	static void getdata(int arr[], int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
	}

	static void display(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void sort(int arr[], int low, int mid, int high) {
		int i, j, k, l;
		int b[] = new int[50];
		l = low;
		i = low;
		j = mid + 1;
		while ((l <= mid) && (j <= high)) {
			if (arr[l] <= arr[j]) {
				b[i] = arr[l];
				l++;
			} else {
				b[i] = arr[j];
				j++;
			}
			i++;
		}
		if (l > mid) {
			for (k = j; k <= high; k++) {
				b[i] = arr[k];
				i++;
			}
		} else {
			for (k = l; k <= mid; k++) {
				b[i] = arr[k];
				i++;
			}
		}
		for (k = low; k <= high; k++) {
			arr[k] = b[k];
		}
	}

	static void partition(int arr[], int low, int high) {
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			partition(arr, low, mid);
			partition(arr, mid + 1, high);
			sort(arr, low, mid, high);
		}
	}

	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of data:");
		n = sc.nextInt();
		int arr[] = new int[20];
		getdata(arr, n);
		partition(arr, 0, n - 1);
		display(arr, n);

	}
}
