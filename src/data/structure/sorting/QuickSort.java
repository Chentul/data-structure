package data.structure.sorting;

import random.array.RandomArray;

public class QuickSort extends RandomArray {
	
	public QuickSort() {
		super();
	}
	
	public QuickSort(int size) {
		super(size);
	}
	
	public QuickSort(int size, int max, int min) {
		super(size, max, min);
	}
	
	public int[] sort(int[] unSortedArray, int begin, int end) {
		if(begin < end) {
			int partitionIndex = partition(unSortedArray, begin, end);
			sort(unSortedArray, begin, partitionIndex - 1);
			sort(unSortedArray, partitionIndex + 1, end);
		}
		return unSortedArray;
	}
	
	private int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = (begin - 1);
		
		for(int j = begin; j < end; j++) {
			if(arr[j] <= pivot) {
				i++;
				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}
		
		int swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;
		return i + 1;
	}
	
	public void quickSortRun() {
		this.fillRandomArray();
		System.out.println("Unsorted array: " + this.printArray(this.randomArray));
		System.out.println("Sorted array:   " + this.printArray(this.sort(this.randomArray, 0, this.randomArray.length - 1)));
	} 
	
}
