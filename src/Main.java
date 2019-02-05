import java.util.Scanner;
import datastructure.sorting.Sort;

public class Main {

	public static void main(String[] args) {

		int option = 1;
		Scanner scan = new Scanner(System.in);

		while (option > 0) {
			printMenu();
			option = scan.nextInt();
			switch (option) {
			case 1:
				new Sort().sortRun();
				break;
			default:
				break;
			}

		}

	}

	public static void printMenu() {
		System.out.println("Main menu");
		System.out.println("1.- Sorting");
		System.out.print("Select option: ");
	}

}
