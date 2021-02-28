package by.academy.homwork.hw4.task2;

public class Generic<E> {
	public final static int SIZE = 1;
	private E[] arr;
	private int length;
	private int count;

	public E[] getArr() {
		return arr;
	}

	public void setArr(E[] arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@SuppressWarnings("unchecked")
	public Generic() {
		super();
		this.arr = (E[]) new Object[length = 16];
	}

	@SuppressWarnings("unchecked")
	public Generic(int length) {
		arr = (E[]) new Object[length];
		this.length = length;
	}

	E get(int i) {
		final E e = (E) arr[i];
		return e;
	}

	void set(int i, E e) {
		arr[i] = e;
		setCount(++i);
	}

	/**
	 * метод добавления элементов в массив с дальнейшим расширением массива.
	 */
	@SuppressWarnings("unchecked")
	public void addArray(E e) {
		if (arr == null) {
			arr = (E[]) new Object[SIZE];
		} else {
			if (count + 1 > arr.length) {
				expandArray();
			}
		}
		arr[count++] = e;
	}

	/**
	 * метод увеличения массива.
	 */
	@SuppressWarnings("unchecked")
	public void expandArray() {
		E[] temp = (E[]) new Object[arr.length * 2 + 1];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

	/**
	 * метод взятия последнего заполненого элемента массива.
	 */
	public void getLastElement() {
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] != null) {
				System.out.println("Последний введенный эдемент: " + get(i));
				break;
			}

		}
	}

	/**
	 * метод взятия первого элемента массива.
	 */
	public void getFirst() {
		System.out.println("Первый введеный элемент  - " + arr[0]);
	}

	/**
	 * метод взятия последнего элемента массива.
	 */
	public void getLast() {
		System.out.println("Последний элемент массива - " + arr[length - 1]);
	}

	/**
	 * метод удаления элемента по индексу.
	 */
	public void remove(int i) {
		if (i > count || i < 0) {
			return;
		}
		if (count != i) {
			System.arraycopy(arr, i + 1, arr, i, count - i - 1);
		}
		arr[--count] = null;
	}

	/**
	 * метод удаления элемента по значению.
	 */
	public void removeValue(E e) {
		for (int i = 0; i < arr.length; i++) {
			if (e != null && arr[i].equals(e)) {
				remove(i);
				break;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		for (int i = 0; i < getCount(); i++) {
			builder.append(arr[i] + " ");
		}
		builder.append("]");
		return builder.toString();
	}

}
