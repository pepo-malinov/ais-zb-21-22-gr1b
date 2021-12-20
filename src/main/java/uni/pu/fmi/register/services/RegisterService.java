package uni.pu.fmi.register.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.register.models.User;

public class RegisterService {

	private static List<User> users = new ArrayList<>();
	

	public static String register(final String username, final String password) {

		if (password == null || "".equals(password.trim())) {
			return "missing pass";
		}
		
		if (username == null || "".equals(username.trim())) {
			return "missing username";
		}

		final boolean anyMatch = users.stream()
				.anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));
		if (anyMatch) {
			return "not ok";
		}
		final User newUser = new User(username, password);
		users.add(newUser);
		return "ok";
	}


}
