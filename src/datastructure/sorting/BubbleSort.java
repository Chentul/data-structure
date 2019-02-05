package datastructure.sorting;

public class BubbleSort extends SortAlgorithms {

	public BubbleSort() {
		super();
	}

	private int[] sort(int[] unSortedArray) {
		int aux = 0;
		for (int i = 0; i < unSortedArray.length; i++) {
			for (int j = i + 1; j < unSortedArray.length; j++) {
				if (unSortedArray[i] > unSortedArray[j]) {
					aux = unSortedArray[i];
					unSortedArray[i] = unSortedArray[j];
					unSortedArray[j] = aux;
				}
			}
		}
		return unSortedArray;
	}

	public void bubbleSortRun() {
		this.fillRandomArray();
		System.out.println("Unsorted array: " + this.printArray(this.randomArray));
		System.out.println("Sorted array:   " + this.printArray(this.sort(this.randomArray)));
	}

}
