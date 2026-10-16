package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SteramProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Karthik", "Tamil", "Arunachalam", "gokul");
		list.stream().forEach(System.out::println);
		System.out.println();
		Stream<String> names = Stream.of("Vijay", "Surya", "Ajith");
		names.forEach(System.out::println);
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		Stream s1 = stream.filter(n -> n % 2 == 0);
		s1.forEach(n -> System.out.println(n));
		// stream.forEach(System.out::println);
		System.out.println();
		Stream<String> str = Stream.generate(() -> "Java").limit(4);
		str.forEach(System.out::println);
		Stream<Integer> streams = Stream.iterate(5, n -> n * 2).limit(10);
		streams.forEach(System.out::println);
	}

}
