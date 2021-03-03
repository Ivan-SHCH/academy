package by.academy.homwork.hw5.task3;

import java.util.Iterator;

public class IteratorAr<T> implements Iterator<T> {
	private T[][][] arr;
	private int i;
	private int n;
	private int k;

	public IteratorAr(T[][][] arr) {
		this.arr = arr;
	}

	@Override
	public boolean hasNext() {
		return i < arr.length && n < arr[i].length && k < arr[n].length;
	}

	@Override
	public T next() {
		T temp = arr[i][n][k++];
		if (k >= arr[n].length) {
			n++;
			k = 0;
		}
		
		if (n >= arr[i].length) {
			i++;
			n = 0;
		}

		return (T) temp;

	}
}
