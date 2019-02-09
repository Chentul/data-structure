package data.structure.sorting;

import random.array.RandomArray;

public class InsertionSort extends RandomArray {

	public InsertionSort() {
		super();
	}

	public int[] sort(int[] unSortedArray) {
		for(int i = 1; i < unSortedArray.length; i++) {
			int key = unSortedArray[i];
			int j = i - 1;
			while(j >= 0 && unSortedArray[j] > key) {
				unSortedArray[j + 1] = unSortedArray[j];
				j = j - 1;
			}
			unSortedArray[j + 1] = key;
		}
		return unSortedArray;
	}

	public void insertionSortRun() {
		this.fillRandomArray();
		System.out.println("Unsorted array: " + this.printArray(this.randomArray));
		System.out.println("Sorted array:   " + this.printArray(this.sort(this.randomArray)));
	}

}
