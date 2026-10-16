package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Stream<Integer> s1 = nums.stream();
		Stream<Integer> stream = s1.filter(n -> n % 2 == 0);
		stream.forEach(n -> System.out.println(n));

		int sumOfValues = nums.stream().reduce(0, (a, b) -> a + b);
		System.out.println("sum of given values : " + sumOfValues);
	}

}
