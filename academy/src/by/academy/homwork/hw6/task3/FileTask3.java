package by.academy.homwork.hw6.task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileTask3 {

	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new User("Name" + i, "Surname" + i, 10 + i));
		}

		File folder = new File("users");
		if (!folder.exists()) {
			folder.mkdirs();

		}

		for (int i = 0; i < list.size(); i++) {
			try {
				FileOutputStream file = new FileOutputStream(
						"users//" + list.get(i).getName() + "_" + list.get(i).getSurname() + ".txt");
				ObjectOutputStream object = new ObjectOutputStream(file);
				object.writeObject(list.get(i));
				file.close();
				object.close();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
