package uni.pu.fmi.login.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.register.models.User;

public class LoginService {

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User("ivan", "Pass123"));
	}

	public static String login(final String username, final String password) {

		boolean anyMatch = users.stream()
				.anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));

		return anyMatch ? "success" : "Fail";
	}

}
