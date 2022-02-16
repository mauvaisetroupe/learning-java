package com.mauvaisetroupe.learning.sorting;

import org.junit.jupiter.api.Test;

class SelectionSortEngineTest {

	private SortUtils sortUtils = new SortUtils();

	@Test
	void testSort1() {
		SortEngine selectionEngine = null;
		sortUtils.testArray(0,10,10,selectionEngine);
	}

	@Test
	void testSort2() {
		SortEngine selectionEngine = null;
		sortUtils.testArray(-10,10,20,selectionEngine);
	}

	@Test
	void testSort3() {
		SortEngine selectionEngine = null;
		sortUtils.testArray(-100,100,2000,selectionEngine);
	}



}
