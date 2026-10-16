package Files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\SPLPT1352\\Desktop\\test.txt";
		String textContent = """
				I Love Pizza
				I Love Burger
				I Love Coce
				""";
		try (FileWriter writer = new FileWriter(path)) {
			writer.write(textContent);
			System.out.println("File has been written");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Could not write file");
		}

	}

}
