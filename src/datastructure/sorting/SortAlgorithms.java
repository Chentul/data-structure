package datastructure.sorting;

import java.util.Random;

public class SortAlgorithms {

	public Random rand;
	public int[] randomArray;
	public int max;
	public int min;
	public String PREFIX;

	public SortAlgorithms() {
		this.rand = new Random();
		this.randomArray = new int[10];
		this.max = 25;
		this.min = 1;
		this.PREFIX = " ";
	}

	public void fillRandomArray() {
		for (int i = 0; i < this.randomArray.length; i++) {
			this.randomArray[i] = rand.nextInt(max + 1 - min) + min;
		}
	}

	public String printArray(int[] array) {
		String result = new String(this.PREFIX);
		for (int i = 0; i < array.length; i++) {
			result += this.randomArray[i] + " ";
		}
		return result;
	}

}
