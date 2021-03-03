package by.academy.homwork.hw5.task5;

import java.util.HashMap;
import java.util.Map;

public class HwCollection5 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String str = "Следует составить для него частотный словарь";
		System.out.println(str);
		char[] ch = str.replaceAll("\\s", "").toCharArray();

		for (Character c : ch) {
			if (!map.containsKey(c)) {
				map.put(c, 0);
			}
			map.put(c, map.get(c) + 1);
		}

		for (Character c : map.keySet()) {
			System.out.println("Буква " + c + " - " + map.get(c));
		}
	}
}
