package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAcces.abstracts.UserDao;
import eCommerce.entites.concretes.User;

public class UserManager implements UserService{

	UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}
	
	@Override
	public void add(User user) {
		userDao.add(user);
		System.out.println("User added"+ user.getFirstName());
		
	}

	@Override
	public void update(User user) {
	 userDao.update(user);
		
	}


	@Override
	public User getByEmail(String email) {
		
		return userDao.getByMail(email);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User getMailAndPassword(String email, String password) {
		return userDao.getMailAndPassword(email, password);
	}
    
     
}
