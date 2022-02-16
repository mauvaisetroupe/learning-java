package com.mauvaisetroupe.learning.sorting;

public interface SortEngine<T extends Comparable<T>> {
	public T[] sort(T[] myArray);
}
