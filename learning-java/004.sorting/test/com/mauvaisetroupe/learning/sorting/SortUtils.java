package com.mauvaisetroupe.learning.sorting;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class SortUtils {
	
	public boolean isSorted(Integer[] values, Integer[] sortedValues) {
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


	public Integer[] generateArray(int min, int max, int nbItem) {
		Integer[] values = new Integer[nbItem];
		for (int i = 0; i < values.length; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			values[i] = Integer.valueOf(randomNum);
		}
		return values;
	}
	
	public void testArray(int min, int max, int nbItem, SortEngine<Integer> engine) {
		Integer[] values = this.generateArray(min, max, nbItem);
		Integer[] originalValues = Arrays.copyOf(values, values.length);
		System.out.println(Arrays.toString(values));
		assertFalse(this.isSorted(originalValues, values));
		Integer[] sortedValue =  engine.sort(values);
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(sortedValue));
		assertTrue(Arrays.equals(values, originalValues));
		assertTrue(this.isSorted(originalValues, sortedValue));
	}	


}
