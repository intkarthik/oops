package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {
		sample();
		// TODO Auto-generated method stub
		List<Integer> list = (Arrays.asList(10, 20, 1, 2, 3, 4, 5, 6, 7, 8));
		Stream<Integer> s1 = list.stream();
		Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
		Stream<Integer> s3 = s2.map(n -> n * 2);
		Stream<Integer> s4 = s3.sorted();
		s4.forEach(n -> System.out.print(n + " "));
		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println("\n" + sum);

	}

	public static void sample() {
		List<Integer> list = (Arrays.asList(10, 20, 1, 2, 3, 4, 5, 6, 7, 8));
		list.stream().filter(n -> n % 2 != 0).forEach(m -> System.out.println(m));

		List<String> names = Arrays.asList("Vijay", "Ajith", "Surya", "Karthik", "Vijay");
		List<String> upperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCase);

		List<String> lowerCase = names.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(lowerCase);

		List<String> namesStart = names.stream().filter(name -> name.startsWith("K")).collect(Collectors.toList());
		System.out.println(namesStart);

		List<String> nameEnd = names.stream().filter(name -> name.endsWith("y")).collect(Collectors.toList());
		System.out.println(nameEnd);

		List<String> removeDuplicate = names.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicate);

		List<String> sortNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortNames);

		long count = list.stream().count();
		System.out.println("Counting given int values : " + count);

		long countNames = names.stream().distinct().count();
		System.out.println("Counting given string elemnts in list : " + countNames);

		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println("sum of given elements in list : " + sum);

		int sumofOdds = list.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
		System.out.println("sum of odd numbers : " + sumofOdds);
	}

}
