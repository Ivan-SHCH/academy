package by.academy.homwork.hw5.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class HwCollection1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,4,5,6,7,8,9,9,9,3));
		System.out.println(dublicate(list));
		
	}
	public static <T> Collection<T> dublicate(Collection<T> collection){
		return new HashSet<T>(collection);
	}
}
