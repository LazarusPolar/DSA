package com.sort;

public class QuickSorting {
	static void QuickSort (int[] arr, int low, int high) {
		if(low > high) {
			return;
		}
		
		int mid = low + (high - low)/2;
		int pivot = arr[mid];
		int i = low;
		int j = high;
		
		while(i <= j) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			if(i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
				i++;
				j--;
			}
		}
		
		if(low < j) {
			QuickSort(arr, low, j);
		}
		if(high > i) {
			QuickSort(arr, i, high);
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {10,2,32,44,56,6};
		System.out.println("Antes de Sort: " );
		for (int i : arr) {
			System.out.println("Imprime: " + i);
		}
		QuickSort(arr, 0, arr.length-1);
		System.out.println("Despues del sort: ");
		for (int i : arr) {
			System.out.println("Despues del sort " + i);
		}

	}

}
