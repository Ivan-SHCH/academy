package by.academy.homwork.hw6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTask2 {

	public static void main(String[] args) {
		try(BufferedReader reader  = new BufferedReader(new FileReader("file.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))){
			String line = null;
			while((line = reader.readLine()) != null) {
				writer.write(line.replace(" ", ""));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
