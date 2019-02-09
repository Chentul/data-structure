package data.structure;

import java.util.Scanner;

import data.structure.search.SearchMenu;
import data.structure.sorting.SortMenu;

public class Main {

	public static void main(String[] args) {

		int option = 0;
		Scanner scan = new Scanner(System.in);

		while (option >= 0) {
			printMenu();
			option = scan.nextInt();
			switch (option) {
			case 0:
				System.out.println("Wrong option");
				break;
			case 1:
				new SortMenu().sortRun();
				break;
			case 2:
				new SearchMenu().searchRun();
				break;
			default:
				break;
			}

		}

	}

	public static void printMenu() {
		System.out.println("Main menu");
		System.out.println("1.- Sorting");
		System.out.println("2.- Search");
		System.out.print("Select an option or -1 to exit: ");
	}

}
