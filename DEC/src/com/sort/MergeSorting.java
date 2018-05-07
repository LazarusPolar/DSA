package com.sort;

public class MergeSorting {
	int[] array;
	int[] TempArray;
	
	void prepareForSort(int[] arr) {
		this.array = arr;
		this.TempArray = new int[arr.length];
		doMergeSort(0, arr.length-1);
	}
	
	void doMergeSort(int LowerIndex, int HigherIndex) {
		if(LowerIndex < HigherIndex) {
			int middle = LowerIndex + (HigherIndex - LowerIndex)/2;
			doMergeSort(LowerIndex, middle);
			doMergeSort(middle + 1, HigherIndex);
			MergePart(LowerIndex, middle, HigherIndex);
		}
	}
	
	void MergePart(int LowerIndex, int middle, int HigherIndex) {
		for(int i = LowerIndex; i <= HigherIndex; i++) {
			TempArray[i] = array[i];
		}
		int i = LowerIndex;
		int j = middle + 1;
		int k = LowerIndex; 
		while(i <= middle && j <= HigherIndex) {
			if(TempArray[i] <= TempArray[j]) {
				array[k] = TempArray[i];
				i++;
			} else {
				array[k] = TempArray[j];
				j++;
			}
			k++;
		}
		while(i<= middle) {
			array[k] = TempArray[i];
			k++;
			i++;
		}
	}
}
