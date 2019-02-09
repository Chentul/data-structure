package data.structure.search;

import java.util.Scanner;

public class SearchMenu {

	private int option;
	private Scanner scan;
	private String PREFIX = " ";

	public SearchMenu() {
		this.option = 0;
		this.scan = new Scanner(System.in);
		this.PREFIX = " ";
	}

	private void searchMenu() {
		System.out.println(this.PREFIX.concat("1.- Binary search method"));
		System.out.print(this.PREFIX.concat("Select a method: "));
	}

	public void searchRun() {
		this.searchMenu();
		while (this.option >= 0) {
			this.option = scan.nextInt();
			switch (this.option) {
			case 0:
				System.out.println("Wrong option");
			case 1:
				new BinarySearch().binarySearchRun();
				break;
			default:
				break;
			}
		}
	}

}
