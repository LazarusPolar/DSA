package com.sort;

public class HeapSort {
	static int total;
	
	static void swap(Comparable[] arr, int a, int b) {
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	static void heapify(Comparable[] arr, int i) {
		int lft = i*2; 
		int rgt = i*2 + 1; 
		// Keeps track of elements to check if they need to be swaped or not 
		int grt = i;
		
		if(lft <= total && arr[lft].compareTo(arr[grt]) >=0 ) {
			grt = lft;
		}
		
		// Si se coloca -1 se hace un ordenamiento a la inversa
		if(rgt <= total && arr[rgt].compareTo(arr[grt]) >=0 ) {
			grt = rgt;
		}
		
		if(grt != i) {
			swap(arr, i, grt);
			heapify(arr, grt);
		}
	}
	
	static void sort (Comparable[] arr) {
		total = arr.length - 1;
		for(int i = total/2; i >= 0; i--) {
			heapify(arr, i);
		}
		for(int i = total; i > 0; i--) {
			swap(arr, 0, i);
			total--;
			heapify(arr, 0);
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,2,32,44,56,6};
		System.out.println("Antes de Sort: " );
		for (int i : arr) {
			System.out.println("Imprime: " + i);
		}
		sort(arr);
		System.out.println("Despues del sort: ");
		for (int i : arr) {
			System.out.println("Despues del sort " + i);
		}
	}
}
