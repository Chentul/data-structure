package datastructure.sorting;

public class QuickSort extends SortAlgorithms {
	
	public QuickSort() {
		super();
	}
	
	private int[] sort(int[] unSortedArray) {
		return unSortedArray;
	}
	
	public void quickSortRun() {
		this.fillRandomArray();
		System.out.println("Unsorted array: " + this.printArray(this.randomArray));
		System.out.println("Sorted array:   " + this.printArray(this.sort(this.randomArray)));
	} 
	
}
