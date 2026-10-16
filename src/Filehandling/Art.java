package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Art {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		file();
		fileWriter();
		bufferedReader();
		bufferedReader_1();
		fileReader();
	}

	public static void file() {
		File file = new File("art.txt");
		if (file.exists()) {
			System.out.println("That file exist");
		} else {
			System.out.println("File not exists");
		}
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getName());
		String path = file.getPath();
		System.out.println(path);
		System.out.println(file.toPath());
	}

	public static void fileWriter() {
		try (FileWriter writer = new FileWriter("newFile.txt")) {

			writer.write("Learn java to become a Developer\nAnd To become a Tester");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void bufferedReader() {
		String line;
		try (BufferedReader reader = new BufferedReader(new FileReader("art1.txt"))) {
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void bufferedReader_1() {
		String line;
		try (BufferedReader reader = new BufferedReader(new FileReader("art.txt"))) {
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void fileReader() throws IOException {
		String path = "art1.txt";
		try (FileReader reader = new FileReader(path)) {
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
