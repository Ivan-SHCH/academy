package by.academy.homwork.hw7.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflexionTask2 {

	public static void main(String[] args) {
		User user = new User("Ivan", "Ivanov", 20, "01.01.1900", "Iva", "123456", "1@gmail.com");
		System.out.println(user);
		Class<User> userClass = User.class;
		System.out.println("________________________getMethod____________________________________");
		try {
			Method methodUserName = userClass.getMethod("getLogin");
			System.out.println(methodUserName);
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		}

		System.out.println("______________________getMethods____________________________________");
		Method[] methodsUser = userClass.getMethods();
		for (Method m : methodsUser) {
			System.out.println(m);
		}

		System.out.println("____________________getDeclaredMethod_______________________________");
		try {
			Method methodDeclaredUserName = userClass.getDeclaredMethod("getEmail");
			System.out.println(methodDeclaredUserName);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("_____________________getDeclaredMethods__________________________");
		Method[] methodsDeclaredUser = userClass.getDeclaredMethods();
		for (Method m : methodsDeclaredUser) {
			System.out.println(m);
		}

		System.out.println("________________________getField___________________________");
		try {
			Field fieldUserName = userClass.getField("email");
			System.out.println(fieldUserName);
		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		}

		System.out.println("________________________getFields___________________________");
		Field[] fieldsUser = userClass.getFields();
		for (Field f : fieldsUser) {
			System.out.println(f);
		}

		System.out.println("________________________getDeclaredField___________________________");
		try {
			Field fieldDeclaredUserName = userClass.getDeclaredField("email");
			System.out.println(fieldDeclaredUserName);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		System.out.println("___________________getDeclaredFields______________________________");
		Field[] fieldsDeclaredUser = userClass.getDeclaredFields();
		for (Field f : fieldsDeclaredUser) {
			System.out.println(f);
		}

		/*
		 * Сетаем все значения.
		 */
		Class<? extends User> userSetClass = user.getClass();
		Class<?> superClass = userSetClass.getSuperclass();
		try {
			Field setFirstName = superClass.getDeclaredField("firstName");
			Field setLastName = superClass.getDeclaredField("lastName");
			Field setAge = superClass.getDeclaredField("age");
			Field setDateOfBirth = superClass.getDeclaredField("dateOfBirth");
			setFirstName.setAccessible(true);
			setLastName.setAccessible(true);
			setAge.setAccessible(true);
			setDateOfBirth.setAccessible(true);
			try {
				setFirstName.set(user, "Vasya");
				setLastName.set(user, "Pupkin");
				setAge.set(user, 30);
				setDateOfBirth.set(user, "01.01.2000");
				System.out.println(setFirstName);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		try {
			Field setLogin = userSetClass.getDeclaredField("login");
			Field setPassword = userSetClass.getDeclaredField("password");
			Field setEmail = userSetClass.getDeclaredField("email");
			setLogin.setAccessible(true);
			setPassword.setAccessible(true);
			setEmail.setAccessible(true);
			try {
				setLogin.set(user, "Ivashka");
				setPassword.set(user, "1123221123");
				setEmail.set(user, "g@mail.com");
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

		/*
		 * Вызов toString через invoke.
		 */
		try {
			Method method = user.getClass().getDeclaredMethod("printUserInfo");
			method.setAccessible(true);
			try {
				method.invoke(user);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
