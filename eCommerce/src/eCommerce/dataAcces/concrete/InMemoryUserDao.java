package eCommerce.dataAcces.concrete;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAcces.abstracts.UserDao;
import eCommerce.entites.concretes.User;

public class InMemoryUserDao implements UserDao{

	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted" + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated" + user.getFirstName());
		
	}


	@Override
	public User getByMail(String email) {
		for(User user : users) {
			if(user.getEposta() == email)
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		List<User> users=new ArrayList<User>();
		
		return users;
	}

	@Override
	public User getMailAndPassword(String email, String password) {
		for(User user : users) {
			if(user.getEposta() == email && user.getPassword() == password)
				return user;
		}
		return null;
	}

}
