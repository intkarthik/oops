package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Gokul", "Tamil", "Loguprakash", "Logananth", "Manoj");
		Optional<String> findLength = list.stream().sorted().map(String::toUpperCase)
				.filter(name -> name.startsWith("L")).filter(length -> length.length() > 7).findAny();
		System.out.println(findLength);

		long count = list.stream().filter(name -> name.length() > 7).count();
		System.out.println(count);

		List<String> findname = list.stream().map(name -> name.replaceFirst("Gokul", "Kannan"))
				.collect(Collectors.toList());
		System.out.println("Replacing the first element : " + findname);

		int [] values = { 10, 20, 10, 9, 4 ,5 };
		int sum = Arrays.stream(values).filter(n -> n%2!=0).sum();
		System.out.println(sum);
		
		}

}
