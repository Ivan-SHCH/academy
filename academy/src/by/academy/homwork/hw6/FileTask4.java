package by.academy.homwork.hw6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

public class FileTask4 {

	public static void main(String[] args) {
		Random rand = new Random();
		String line = null;
		StringBuffer textLine = new StringBuffer();
		File folder = new File("folder");
		if (!folder.exists()) {
			folder.mkdir();
		}

		try (BufferedReader reader = new BufferedReader(new FileReader("task4.txt"));
				BufferedWriter result = new BufferedWriter(new FileWriter("folder//resul.txt"))) {

			while ((line = reader.readLine()) != null) {
				textLine.append(line);
			}

			for (int i = 1; i <= 100; i++) {
				File file = new File("folder//" + i + ".txt");
				try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
					writer.write(textLine.substring(0, rand.nextInt(textLine.length())));

				} catch (Exception e) {
					e.printStackTrace();
				}

				if (result != null) {
					result.write("Имя файла - " + file.getName() + ", его размер " + file.length() + "byte. ");
					result.newLine();
					result.flush();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
