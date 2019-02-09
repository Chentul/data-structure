package data.structure.sorting;

import java.util.Scanner;

public class SortMenu {

	private int option;
	private Scanner scan;
	private String PREFIX = " ";

	public SortMenu() {
		this.option = 0;
		this.scan = new Scanner(System.in);
		this.PREFIX = " ";
	}

	private void sortMenu() {
		System.out.println(this.PREFIX.concat("1.- Bubble sort method"));
		System.out.println(this.PREFIX.concat("2.- Insert sort method"));
		System.out.println(this.PREFIX.concat("3.- Quick sort method"));
		System.out.println(this.PREFIX.concat("4.- Merge sort method"));
		System.out.print(this.PREFIX.concat("Select a method: "));
	}

	public void sortRun() {
		this.sortMenu();
		this.option = scan.nextInt();
		switch (this.option) {
		case 0:
			System.out.println("Wrong option");
		case 1:
			new BubbleSort().bubbleSortRun();
			break;
		case 2:
			new InsertionSort().insertionSortRun();
			break;
		case 3:
			new QuickSort(4).quickSortRun();
			break;
		default:
			break;
		}
	}

}
