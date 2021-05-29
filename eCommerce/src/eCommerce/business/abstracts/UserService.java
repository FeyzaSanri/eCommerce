package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entites.concretes.User;

public interface UserService {
	 void add(User user);
	 void delete(User user);
	 void update(User user);
	 User getMailAndPassword(String email, String password);
	 User getByEmail(String email);
	 
	 
	 List<User> getAll();
	 
}
