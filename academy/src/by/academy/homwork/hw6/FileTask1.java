package by.academy.homwork.hw6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileTask1 {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new FileWriter("src//filetask1.txt"))) {
			String line = null;
			while (!(line = reader.readLine()).equals("stop")) {
				writer.write(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
