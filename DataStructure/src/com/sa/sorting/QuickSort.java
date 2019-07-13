package com.sa.sorting;
//QuickSort Algorithm :
class QuickSort {
	static void print(int a[]) {
		for (int i = 0; i <= 8; i++) {
			System.out.println(a[i] + " ");
		}
	}
static void Qsort(int data[], int left, int right) {
		int mid, tmp, i, j;
		i = left;
		j = right;
		mid = data[(left + right) / 2];
		do {
			while (data[i] < mid)
				i++;
			while (mid < data[j])
				j--;
			if (i <= j) {
				tmp = data[i];
				data[i] = data[j];
				data[j] = tmp;
				i++;
				j--;
			}
		} while (i <= j);
		if (left < j)
			Qsort(data, left, j);
		if (i < right)
			Qsort(data, i, right);
	}

	public static void main(String args[]) {
		int array[] = { 9, 4, 7, 2, 8, 1, 3, 6, 5 };
		System.out.println("Before sort:");
		print(array);
		Qsort(array, 0, 8);
		System.out.println("After sort:");
		print(array);

	}
}
