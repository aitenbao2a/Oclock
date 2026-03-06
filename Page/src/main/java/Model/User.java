package Model;

import java.util.List;

public class User {
	private int userId;
	private String userName;
	private String password;
	private List<Product> shoppingCart;

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
}
