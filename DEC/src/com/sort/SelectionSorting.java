package com.sort;


public class SelectionSorting {
	
	static void SelectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int index = i; 
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j; 
				}
			}
			if(index != i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {10,2,32,44,56,6};
		System.out.println("Antes de Sort: " );
		for (int i : arr) {
			System.out.println("Imprime: " + i);
		}
		SelectionSort(arr);
		System.out.println("Despues del sort: ");
		for (int i : arr) {
			System.out.println("Despues del sort " + i);
		}
	}
}
