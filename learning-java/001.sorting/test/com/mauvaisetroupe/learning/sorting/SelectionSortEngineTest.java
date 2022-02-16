package com.mauvaisetroupe.learning.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import com.mauvaisetroupe.learning.sorting.selection.SelectionSortEngine;

class SelectionSortEngineTest {

	@Test
	void testSort1() {
		testArray(0, 10, 10);
	}

	@Test
	void testSort2() {
		testArray(-10, 10, 20);
	}

	@Test
	void testSort3() {
		testArray(-100, 100, 2000);
	}

	private void testArray(int min, int max, int nbItem) {
		SortUtils sortUtils = new SortUtils();
		int[] values = sortUtils.generateArray(min, max, nbItem);
		SelectionSortEngine engine = new SelectionSortEngine();
		System.out.println(Arrays.toString(values));
		assertFalse(sortUtils.isSorted(values));
		engine.sort(values);
		System.out.println(Arrays.toString(values));
		assertTrue(sortUtils.isSorted(values));
	}

}
