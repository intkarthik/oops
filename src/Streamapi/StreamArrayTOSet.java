package Streamapi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamArrayTOSet {

	public static void main(String[] args) throws IOException {
		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("Karthik", "Loga", "Syed", "Santosh");
		// converting streams into an array
		String[] array = stream.toArray(String[]::new);
		// creating a hash set
		List<String> set = new ArrayList<String>();
		// Converting Array to set
		Collections.addAll(set, array);
		// displaying the elements
		set.forEach(result -> System.out.print(result + " "));
		set.stream().map(String::toUpperCase).toList().forEach(result -> System.out.println("\n" + result));

		System.out.println("Enter the number : ");
		int num = System.in.read();
		System.out.println(num);
	}

}
