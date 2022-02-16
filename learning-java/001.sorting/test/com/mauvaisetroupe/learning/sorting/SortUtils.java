package com.mauvaisetroupe.learning.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SortUtils {
	
	public boolean isSorted(int[] values, int[] sortedValues) {
		if (values.length!=sortedValues.length) {
			return false;
		}
		Arrays.sort(values);		
		for (int i = 0; i < sortedValues.length-1; i++) {
			if (values[i]!=sortedValues[i]) {
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
