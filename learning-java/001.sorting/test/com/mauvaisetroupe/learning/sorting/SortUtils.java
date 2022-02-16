package com.mauvaisetroupe.learning.sorting;

import java.util.concurrent.ThreadLocalRandom;

public class SortUtils {
	
	public boolean isSorted(int[] values) {
		for (int i = 0; i < values.length-1; i++) {
			if (values[i]>values[i+1]) {
				return false;
			}
		}
		return true;
	}


	public int[] generateArray(int min, int max, int nbItem) {
		int[] values = new int[nbItem];
		for (int i = 0; i < values.length; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			values[i] = randomNum;
		}
		return values;
	}


}
