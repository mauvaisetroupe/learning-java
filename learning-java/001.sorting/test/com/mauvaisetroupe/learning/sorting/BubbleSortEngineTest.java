package com.mauvaisetroupe.learning.sorting;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.mauvaisetroupe.learning.sorting.bubble.BubbleSortEngine;


class BubbleSortEngineTest {

	@Test
	void testSort1() {
		testArray(0,10,10);
	}

	@Test
	void testSort2() {
		testArray(-10,10,20);
	}

	@Test
	void testSort3() {
		testArray(-100,100,2000);
	}

	
	private void testArray(int min, int max, int nbItem) {
		SortUtils sortUtils = new SortUtils();		
		int[] values = sortUtils.generateArray(min, max, nbItem);
		int[] originValues = Arrays.copyOf(values,values.length);		
		BubbleSortEngine engine = new BubbleSortEngine();
		System.out.println(Arrays.toString(values));
		assertFalse(sortUtils.isSorted(originValues, values));
		engine.sort(values);
		System.out.println(Arrays.toString(values));
		assertTrue(sortUtils.isSorted(originValues, values));				
	}


}
