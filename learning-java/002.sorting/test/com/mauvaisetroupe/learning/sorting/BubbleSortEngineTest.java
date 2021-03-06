package com.mauvaisetroupe.learning.sorting;

import org.junit.jupiter.api.Test;


class BubbleSortEngineTest {

	private SortUtils sortUtils = new SortUtils();

	@Test
	void testSort1() {
		SortEngine engine = null;
		sortUtils.testArray(0,10,10,engine);
	}

	@Test
	void testSort2() {
		SortEngine engine = null;
		sortUtils.testArray(-10,10,20,engine);
	}

	@Test
	void testSort3() {
		SortEngine engine = null;
		sortUtils.testArray(-100,100,2000,engine);
	}


}
