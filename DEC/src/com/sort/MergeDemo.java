package com.sort;

public class MergeDemo {

	public static void main(String[] args) {
		int[] arr = {10,2,32,44,56,6};
		System.out.println("Antes de Sort: " );
		for (int i : arr) {
			System.out.println("Imprime: " + i);
		}
		new MergeSorting().prepareForSort(arr);
		
		System.out.println("Despues del sort: ");
		for (int i : arr) {
			System.out.println("Despues del sort " + i);
		}

	}

}
