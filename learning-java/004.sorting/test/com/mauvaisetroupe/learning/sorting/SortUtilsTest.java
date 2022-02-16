package com.mauvaisetroupe.learning.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortUtilsTest extends SortUtils {

	@Test
	void testIsSorted() {
		SortUtils sortUtils = new SortUtils();
		assertTrue(sortUtils.isSorted(new Integer[] {1,3,2},new Integer[]{1,2,3}));
		assertFalse(sortUtils.isSorted(new Integer[] {1,3,2},new Integer[]{0,1,2}));
		assertFalse(sortUtils.isSorted(new Integer[] {1,3,2},new Integer[]{1,2}));
		assertFalse(sortUtils.isSorted(new Integer[] {1,3,2},new Integer[]{1,2,3,4}));
	}

}
