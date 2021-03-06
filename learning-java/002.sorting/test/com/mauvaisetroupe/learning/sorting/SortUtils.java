package com.mauvaisetroupe.learning.sorting;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	
	public void testArray(int min, int max, int nbItem, SortEngine engine) {
		SortUtils sortUtils = new SortUtils();
		int[] values = sortUtils.generateArray(min, max, nbItem);
		int[] originalValues = Arrays.copyOf(values, values.length);
		System.out.println(Arrays.toString(values));
		assertFalse(sortUtils.isSorted(originalValues, values));
		engine.sort(values);
		System.out.println(Arrays.toString(values));
		assertTrue(sortUtils.isSorted(originalValues, values));
	}	


}
