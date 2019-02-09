package data.structure.search;

import java.util.Scanner;

import data.structure.sorting.QuickSort;
import random.array.RandomArray;

public class BinarySearch extends RandomArray {

	private Scanner scan;

	public BinarySearch() {
		super();
		scan = new Scanner(System.in);
	}

	public BinarySearch(int size) {
		super(size);
	}

	public int binarySearch(int[] array, int key, int low, int high) {
		int index = Integer.MAX_VALUE;

		while (low <= high) {
			int middle = (low + high) / 2;
			if (array[middle] < key) {
				low = middle + 1;
			} else if (array[middle] > key) {
				high = middle - 1;
			} else {
				index = middle;
				break;
			}
		}

		return index;
	}

	public void binarySearchRun() {
		this.fillRandomArray();
		int[] sortedArray = new QuickSort().sort(this.randomArray, 0, this.randomArray.length - 1);

		System.out.println("Array: " + this.printArray(this.randomArray));
		System.out.print("Type the element you want to find: ");
		int element = scan.nextInt();
		int index = this.binarySearch(sortedArray, element, 0, sortedArray.length - 1);

		if (index == -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not present");
		}
		scan.next();
	}

}
