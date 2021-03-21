package by.academy.homwork.hw7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTask1 {

	public static void main(String[] args) {
		List<Long> result = Stream.generate(() -> new Random().nextInt(100)).limit(100)
				.map(x -> (long) (x * Math.PI) - 20).filter(x -> x < 100).sorted().collect(Collectors.toList());
		System.out.println("Проверка списка");
//		System.out.println(result);

		try {
			Map<Long, String> map = result.stream().skip(3).distinct()
					.collect(Collectors.toMap(Function.identity(), value -> "Number " + value.toString()));
			System.out.println();
//			map.forEach((k, v) -> System.out.println(k + " " + v));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
