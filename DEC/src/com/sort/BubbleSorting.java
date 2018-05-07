package com.sort;

public class BubbleSorting {
	
	static void BubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(arr[j - 1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {10,2,32,44,56,6};
		System.out.println("Antes de Sort: " );
		for (int i : arr) {
			System.out.println("Imprime: " + i);
		}
		BubbleSort(arr);
		System.out.println("Despues del sort: ");
		for (int i : arr) {
			System.out.println("Despues del sort " + i);
		}
	}

}
