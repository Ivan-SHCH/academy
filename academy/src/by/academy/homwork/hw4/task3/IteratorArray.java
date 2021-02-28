package by.academy.homwork.hw4.task3;

import java.util.Iterator;

public class IteratorArray<T> implements Iterator<T> {
	private T[][] array;
	private int i;
	private int k;

	public IteratorArray(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return i < array.length && k < array[i].length;
	}

	@Override
	public T next() {
		T temp = array[i][k++];
		if(k >= array[i].length) {
			i++;
			k = 0;
		}
		return (T) temp;

	}

}
