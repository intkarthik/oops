package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample1 {

	public static void main(String[] args) {
		new Sample1();
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Logananth", "Arunachalam", "Gokul", "Kavin", "Karthik", "Karthik");
		List<String> list1 = list.stream().map(String::toUpperCase).toList();
		System.out.println(list);
		System.out.println(list1);
		list1.forEach(System.out::println);
		list.stream().filter(name -> name.startsWith("K")).toList()
				.forEach(n -> System.out.println("Name starts with K : " + n));
		list1.stream().sorted().forEach(n -> System.out.println("Sorted list : " + n));
		list1.stream().sorted().distinct().forEach(n -> System.out.println("Remove duplicates : " + n));

	}

	public Sample1() {
		List<Integer> list = Arrays.asList(12, 2, 9, 10, 100, 102, 34, 2, 99, 23);
		list.stream().filter(n -> n % 2 == 0).forEach(result -> System.out.println(result));

		int index = list.get(0);
		System.out.println("First Index : " + index);
		long countInt = list.stream().count();
		System.out.println(countInt);
		long count = list.stream().peek(System.out::println).count();
		System.out.println(count);
		
		Stream.of("one", "two", "three", "four")
         .filter(e -> e.length() > 3)
         .peek(e -> System.out.println("Filtered value: " + e))
         .map(String::toUpperCase)
         .peek(e -> System.out.println("Mapped value: " + e))
         .collect(Collectors.toList());
	}

}
